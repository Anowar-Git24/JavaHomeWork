package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilereader {

	public static String getPropertyValue(String key) throws IOException {
		String temp = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(temp + "/NopCommerce_BDD_Cucumber_Maven_Project/src/test/resources/config/configeration.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}

}
