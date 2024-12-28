package Com.Utility;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;

	public void ReadConfig()
	{
		String path=("C:\\Users\\DELL\\eclipse-workspace\\AUTOMATION_PROJECT\\src\\test\\resources\\Config\\config.properties");

		try {

			FileInputStream fls = new FileInputStream(path);

			pro = new Properties();
			pro.load(fls);

		} catch (Exception e) {
			System.out.print("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() 
	{
		return pro.getProperty("BaseURL");
		
	}

}


