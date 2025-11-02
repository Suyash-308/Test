package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(" Driver not found!");
        }
    }

    public static Connection getConnection() {
       java.sql.Connection connection = null;

        File file = new File("C:\\Users\\SUYAS\\IdeaProjects\\Student Registration\\src\\main\\resources\\application.properties");
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream(file)) {
            properties.load(fis);

            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");


            connection = DriverManager.getConnection(url, username, password);

        } catch (IOException e) {
            throw new RuntimeException("⚠ Error loading", e);
        } catch (SQLException e) {
            throw new RuntimeException(" connection issue", e);
        }

        return connection;
    }


}
