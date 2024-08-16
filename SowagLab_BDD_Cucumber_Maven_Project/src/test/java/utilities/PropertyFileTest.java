package utilities;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileTest {

    @BeforeClass
    public void writeProperties() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("URL", "https://www.saucedemo.com/");
        properties.setProperty("firstname", "Md");
        properties.setProperty("lastname", "Hossain");
        properties.setProperty("email", "mahossain3094@gmail.com");
        properties.setProperty("phonenumber", "7329127330");
        properties.setProperty("age", "37");
        properties.setProperty("streetname", "30 Minebrook Road Apt 72A");
        properties.setProperty("cityname", "Edison");
        properties.setProperty("statename", "New Jersey");
        properties.setProperty("zipcode", "08820");

        String filepath = System.getProperty("user.home") + "/JavaHomeWork/SowagLab_BDD_Cucumber_Maven_Project/target/config.properties";
        
        FileOutputStream file = new FileOutputStream(filepath);
        properties.store(file, "Sample data in properties file");
        file.close();
        
        System.out.println("Properties have been written into " + filepath);
    }

    @Test
    public void readProperties() throws IOException {
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
        
        // Assertions to verify the properties
        assert URL != null && URL.equals("https://www.saucedemo.com/");
        assert firstname != null && firstname.equals("Md");
        assert lastname != null && lastname.equals("Hossain");
        assert phonenumber != null && phonenumber.equals("7329127330");
        assert email != null && email.equals("mahossain3094@gmail.com");
        assert age != null && age.equals("37");
        assert streetname != null && streetname.equals("30 Minebrook Road Apt 72A");
        assert cityname != null && cityname.equals("Edison");
        assert statename != null && statename.equals("New Jersey");
        assert zipcode != null && zipcode.equals("08820");

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
