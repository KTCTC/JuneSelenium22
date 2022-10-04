package property.file;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyHelper {
	private Properties prop;
	
	public PropertyHelper(String fileName) {
		try {

			File f = new File(System.getProperty("user.dir") + "\\"+fileName);

			FileInputStream fis = new FileInputStream(f);

			 prop = new Properties();

			prop.load(fis);
		} catch (Exception e) {

		}
	}
	
	
	public String getPropertyValue(String key)
	{
		return prop.getProperty(key);
	}
	
	

	

}
