package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class Study_Tour {

    @Test(priority = 1)
    public void testNiagaraFalls() throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Study_tour", "root", "");
        System.out.println("Connected to MySQL DB");

        // Execute query on niagara_falls table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM niagara_falls");

        System.out.println("Niagara Falls Table Data:");
        while (rs.next()) {
            String studentName = rs.getString("student_name");
            int age = rs.getInt("age");
            String grade = rs.getString("grade");
            String visitDate = rs.getString("visit_date");
            double durationHours = rs.getDouble("duration_hours");
            String favoriteActivity = rs.getString("favorite_activity");

            System.out.println("Student Name: " + studentName);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
            System.out.println("Visit Date: " + visitDate);
            System.out.println("Duration Hours: " + durationHours);
            System.out.println("Favorite Activity: " + favoriteActivity);
            System.out.println("---------------------------------");
        }

        rs.close();
        stmt.close();
        con.close();
    }

    @Test(priority = 2)
    public void testMountWashington() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Study_tour", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mount_washington");

        System.out.println("Mount Washington Table Data:");
        while (rs.next()) {
            String studentName = rs.getString("student_name");
            int age = rs.getInt("age");
            String grade = rs.getString("grade");
            String visitDate = rs.getString("visit_date");
            double hikingDistanceKm = rs.getDouble("hiking_distance_km");
            String weatherCondition = rs.getString("weather_condition");

            System.out.println("Student Name: " + studentName);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
            System.out.println("Visit Date: " + visitDate);
            System.out.println("Hiking Distance (km): " + hikingDistanceKm);
            System.out.println("Weather Condition: " + weatherCondition);
            System.out.println("---------------------------------");
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
