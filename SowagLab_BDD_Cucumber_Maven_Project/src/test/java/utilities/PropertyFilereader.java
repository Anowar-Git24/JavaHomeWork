package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilereader {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String filepath = System.getProperty("user.home") + "/JavaHomeWork/SowagLab_BDD_Cucumber_Maven_Project/target/config.properties";
        
        System.out.println("File path: " + filepath); // Debugging line
        
        FileInputStream file = new FileInputStream(filepath);
        properties.load(file);
        file.close();
        
        // Read the data from the property file
        String URL = properties.getProperty("URL");
        String firstname = properties.getProperty("firstname");
        String lastname = properties.getProperty("lastname");
        String phonenumber = properties.getProperty("phonenumber");
        String email = properties.getProperty("email");
        String age = properties.getProperty("age");
        String streetname = properties.getProperty("streetname");
        String cityname = properties.getProperty("cityname");
        String statename = properties.getProperty("statename");
        String zipcode = properties.getProperty("zipcode");
        
        System.out.println("URL: " + URL);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Street Name: " + streetname);
        System.out.println("City Name: " + cityname);
        System.out.println("State Name: " + statename);
        System.out.println("Zip Code: " + zipcode);
    }
}
