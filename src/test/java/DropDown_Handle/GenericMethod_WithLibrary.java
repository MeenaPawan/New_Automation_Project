package DropDown_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethod_WithLibrary {

	public static void main(String[] args) throws Exception 
	{
		 //Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:/demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Identify WebElement
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(3000);
	    Library.HandleDropDown(country, "INDIA");
	    Thread.sleep(3000);
	    
	   // Browser close
		driver.close();
	}

}
