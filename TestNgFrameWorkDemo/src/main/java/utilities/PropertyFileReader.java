package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static String getPropertyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\Workspaces\\Nexvali3\\SeleniumDemos\\src\\test\\java\\resources\\configuration.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}

}
