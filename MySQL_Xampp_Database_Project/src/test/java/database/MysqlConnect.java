package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MysqlConnect {
    
    @Test
    public void testDB() throws ClassNotFoundException, SQLException {

        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to the College database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "");
        System.out.println("Connected to MySQL DB");

        // Execute query on personal_information table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM personal_information");

        // Iterate through the results and print them
        while (rs.next()) {
            String firstname = rs.getString("firstname");
            String email = rs.getString("email");

            System.out.println("Firstname: " + firstname);
            System.out.println("Email: " + email);
        }

        // Close connection
        con.close();
    }
}
