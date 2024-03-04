package dao;

import entities.Department;

import java.util.List;

public interface DepartmentDAO {

    void insert(Department Department);
    void update(Department Department);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
