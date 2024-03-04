package dao;

import dao.impl.DepartmentDAOJDBC;
import dao.impl.SellerDAOJDBC;
import db.Db;


public class DAOFactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(Db.getConnection());
    }

    public static DepartmentDAO createDepartmentDAO() {
        return new DepartmentDAOJDBC(Db.getConnection());
    }

}
