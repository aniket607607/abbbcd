package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {

	public Properties prop;
	public Baseclass()
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\RASHID\\eclipse-workspace\\2022\\APITest\\src\\main\\java\\Config\\config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
}
