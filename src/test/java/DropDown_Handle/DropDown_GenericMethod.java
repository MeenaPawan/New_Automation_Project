package DropDown_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_GenericMethod 
{
	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	     {
		        //Browser Open
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https:/demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				//Identify WebElement
				WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
				HandleDropDown("BAHAMAS",country);
							
		}
	public static void HandleDropDown(String text,WebElement element) throws Exception
	{
		//Create object of select class
		Select sel=new Select(element);
		
		sel.selectByVisibleText(text);
		Thread.sleep(3000);
	}

	

}
