package Com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static ConfigDataProvider  readConfig = new ConfigDataProvider ();

	public String BaseURL = readConfig.getApplicationURL();
	
	public static WebDriver driver;


	@BeforeClass
	public WebDriver lounchBrowser() throws InterruptedException 
	{

		// Auto Launching chrome Driver
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(BaseURL); // hit the url on the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		return driver;
		
	}
	
	@AfterClass
	
	public void quit() 
	{
		
		driver.quit();
    }


}
