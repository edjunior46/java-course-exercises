import db.Db;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main (String[] args) {

        Connection connection = Db.getConnection();

        /*

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM department")) {

            while(resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }

        */

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, "Richard Red");
            preparedStatement.setString(2, "red@email.com");
            preparedStatement.setDate(3, new java.sql.Date(new SimpleDateFormat("yyyy/MM/dd").parse("2003/12/02").getTime()));
            preparedStatement.setDouble(4, 3000.00);
            preparedStatement.setInt(5, 2);

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Db.closeConnection();

    }

}