package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Teachers {
	
	@Test
	public void testDB()  throws ClassNotFoundException, SQLException {

		 // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to the College database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "");
        System.out.println("Connected to MySQL DB");

        // Execute query on students_details table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM teachers");

        // Iterate through the results and print them
        while (rs.next()) {
            String teacherid = rs.getString("teacherid");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String gender = rs.getString("gender");
            String dateofbirth = rs.getString("dateofbirth");  
            String email = rs.getString("email");
            String phonenumber = rs.getString("phonenumber");
            String department = rs.getString("department");
            String salary = rs.getString("salary");
            String hiredate = rs.getString("hiredate");
            String isfulltime = rs.getString("isfulltime");

            System.out.println("TeacherID: " + teacherid);
            System.out.println("FirstName: " + firstname);
            System.out.println("LastName: " + lastname);
            System.out.println("Gender: " + gender);
            System.out.println("DateOfBirth: " + dateofbirth);
            System.out.println("Email: " + email);
            System.out.println("PhoneNumber:" + phonenumber);
            System.out.println("Department:" + department);
            System.out.println("Salary: " + salary);
            System.out.println("HireDate: " + hiredate);
            System.out.println("IsFullTime: " + isfulltime);
            
            
        }

        // Close connection
        con.close();
    }
}


