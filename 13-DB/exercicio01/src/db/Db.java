package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Db {

    //props, open, close

    private static Connection connection = null;

    private static Properties getProperties() {
        try (FileInputStream fileInputStream = new FileInputStream("db.properties")) {
           Properties properties = new Properties();
           properties.load(fileInputStream);
           return properties;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            Properties properties = getProperties();
            String url = properties.getProperty("url");
            connection = DriverManager.getConnection(url, properties);
            return connection;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
