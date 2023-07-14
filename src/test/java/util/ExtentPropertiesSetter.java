package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExtentPropertiesSetter {
	private  Properties prop = new Properties();
	private String projectPath = System.getProperty("user.dir");

	/**
	 * This method is used to set the properties from extent.properties file
	 * @return it returns Properties prop object
	 */
	public Properties updatePropertiesFile(String propertyName, String propertyValue)  {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(projectPath + "/src/test/resources/config/extent.properties");
			prop.load(ip);
			prop.setProperty(propertyName, propertyValue);
			
			FileOutputStream fos=new FileOutputStream(projectPath + "/src/test/resources/config/extent.properties");
			prop.store(fos, null);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}


}
