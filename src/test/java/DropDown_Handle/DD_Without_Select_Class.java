package DropDown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DD_Without_Select_Class {

	public static void main(String[] args) 
	{
		//Browser Open
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https:/demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				//Identify WebElement For Country
				WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
				country.click();
				
				
				//Identify WebElement For list of Country
				List<WebElement>  AllOptions= driver.findElements(By.xpath("//select[@name='country']//option"));
				int list= AllOptions.size();
				System.out.println(list);
				
				// DropDown Using  for loop				
				for(int i=0;i<list;i++)
				{
					String text=AllOptions.get(i).getText();
					System.out.println(text);
					
					if(text.equals("INDIA"))
					{
						AllOptions.get(i).click();
						break;
					}
				}
				
				//Browser close
				//driver.close();
	}

}
