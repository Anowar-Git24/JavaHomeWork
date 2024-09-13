package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Students_Details {
    
    @Test
    public void testDB() throws ClassNotFoundException, SQLException {

        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to the College database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "");
        System.out.println("Connected to MySQL DB");

        // Execute query on students_details table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students_details");

        // Iterate through the results and print them
        while (rs.next()) {
            String roll = rs.getString("roll");
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            String age = rs.getString("age");  
            String gpa = rs.getString("gpa");
            String id = rs.getString("id");
            String reg_num = rs.getString("reg_num");
            

            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
            System.out.println("ID:" + id);
            System.out.println("Reg_Num:" + reg_num);
            
        }

        // Close connection
        con.close();
    }
}
