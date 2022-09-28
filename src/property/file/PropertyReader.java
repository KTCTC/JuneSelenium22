package property.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		
		String msg = System.getProperty("user.dir");
		System.out.println(msg);

		File f = new File(System.getProperty("user.dir")+"\\env.properties");
		
		FileInputStream fis =new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String ss = prop.getProperty("baseUrl");
		System.out.println(ss);
		
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("passWord"));

		

	}

}
