package dao.impl;

import dao.SellerDAO;
import db.DbException;
import entities.Department;
import entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SellerDAOJDBC implements SellerDAO {

    private final Connection connection;

    public SellerDAOJDBC(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void insert(Seller seller) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO seller (Name,Email,BirthDate,BaseSalary,DepartmentId) VALUES (?,?,?,?,?)")) {
            preparedStatement.setString(1, seller.getName());
            preparedStatement.setString(2, seller.getEmail());
            preparedStatement.setDate(3, Date.valueOf(seller.getBirthDate()));
            preparedStatement.setDouble(4, seller.getBaseSalary());
            preparedStatement.setInt(5, seller.getDepartment().getId());

            preparedStatement.execute();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void update(Seller seller) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE seller SET Name=?,Email=?,BirthDate=?,BaseSalary=?,DepartmentId=? WHERE Id=?")) {
            preparedStatement.setString(1, seller.getName());
            preparedStatement.setString(2, seller.getEmail());
            preparedStatement.setDate(3, Date.valueOf(seller.getBirthDate()));
            preparedStatement.setDouble(4, seller.getBaseSalary());
            preparedStatement.setInt(5, seller.getDepartment().getId());
            preparedStatement.setInt(6, seller.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void deleteById(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM seller WHERE Id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public Seller findById(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT seller.*,department.Name AS DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE seller.Id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Department department = instantiateDepartment(resultSet);
                    return instantiateSeller(resultSet, department);
                }
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return null;
    }

    private Seller instantiateSeller(ResultSet resultSet, Department department) throws SQLException{
        Seller seller = new Seller();
        seller.setId(resultSet.getInt("Id"));
        seller.setName(resultSet.getString("Name"));
        seller.setEmail(resultSet.getString("Email"));
        seller.setBaseSalary(resultSet.getDouble("BaseSalary"));
        seller.setBirthDate(resultSet.getDate("BirthDate").toLocalDate());
        seller.setDepartment(department);
        return seller;
    }

    private Department instantiateDepartment(ResultSet resultSet) throws SQLException{
        Department department = new Department();
        department.setId(resultSet.getInt("DepartmentId"));
        department.setName(resultSet.getString("DepName"));
        return department;
    }

    @Override
    public List<Seller> findAll() {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT seller.*,department.Name AS DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id ORDER BY Name");
        ResultSet resultSet = preparedStatement.executeQuery()) {
            List<Seller> sellers = new ArrayList<>();
            Map<Integer, Department> departmentMap = new HashMap<>();
            while (resultSet.next()) {
                Department departmentExists = departmentMap.get(resultSet.getInt("DepartmentId"));
                if (departmentExists == null) {
                    departmentExists = instantiateDepartment(resultSet);
                    departmentMap.put(resultSet.getInt("DepartmentId"), departmentExists);
                }
                Seller seller = instantiateSeller(resultSet, departmentExists);
                sellers.add(seller);
            }
            return sellers;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT seller.*,department.Name AS DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE department.Id = ? ORDER BY Name")) {
            preparedStatement.setInt(1, department.getId());
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Seller> sellers = new ArrayList<>();
                while (resultSet.next()) {
                    sellers.add(instantiateSeller(resultSet, department));
                }
                return sellers;
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }


}
