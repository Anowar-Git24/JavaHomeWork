package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class ConnectMyXampp {

    @Test
    public void testDB() throws SQLException {

        // Correct MySQL database URL
        String url = "jdbc:mysql://localhost:3306/College"; 
        String user = "root"; // Default username for XAMPP MySQL
        String password = ""; // Default password for XAMPP MySQL is empty

        // Use try-with-resources to ensure the connection is closed automatically
        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            // Check if connection is successful
            if (connection != null) {
                System.out.println("Connected to the College!");
            } else {
                System.out.println("Failed to connect to the College.");
            }

        } catch (SQLException e) {
            System.out.println("Connection to MySQL failed. Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
