package dao.impl;

import dao.DepartmentDAO;
import db.DbException;
import entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOJDBC implements DepartmentDAO {

    private final Connection connection;

    public DepartmentDAOJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Department department) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO (department) VALUES (?)")) {
            preparedStatement.setString(1, department.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void update(Department department) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE department SET Name=? WHERE Id=?")) {
            preparedStatement.setString(1, department.getName());
            preparedStatement.setInt(2, department.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void deleteById(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM department WHERE Id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public Department findById(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM department WHERE Id=?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return instantiateDepartment(resultSet);
                }
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Department> findAll() {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM department")) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Department> departments = new ArrayList<>();
                while (resultSet.next()) {
                    departments.add(instantiateDepartment(resultSet));
                }
                return departments;
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    private Department instantiateDepartment(ResultSet resultSet) throws SQLException{
        Department department = new Department();
        department.setId(resultSet.getInt("Id"));
        department.setName(resultSet.getString("Name"));
        return department;
    }
}
