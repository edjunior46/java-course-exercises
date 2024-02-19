import db.Db;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Connection connection = Db.getConnection();

        try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE DepartmentId = ?")) {
            preparedStatement.setDouble(1, 500.00);
            preparedStatement.setInt(2, 2);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }

        Db.closeConnection();

    }
}