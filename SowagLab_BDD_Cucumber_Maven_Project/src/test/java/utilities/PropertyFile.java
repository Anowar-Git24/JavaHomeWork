package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    
    public static void main(String[] args) throws IOException {
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
}
