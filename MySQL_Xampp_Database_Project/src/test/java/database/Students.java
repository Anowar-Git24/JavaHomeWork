package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Students {
    
    @Test
    public void testDB() throws ClassNotFoundException, SQLException {

        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to the College database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "");
        System.out.println("Connected to MySQL DB");

        // Execute query on students table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        // Iterate through the results and print them
        while (rs.next()) {
            String roll = rs.getString("roll");
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            String age = rs.getString("age");  // Use getString() instead of getNString()
            String gpa = rs.getString("gpa");

            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
        }

        // Close connection
        con.close();
    }
}
