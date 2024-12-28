package DropDown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DD_Using_Select_Class
{
	public static void main(String[] args) throws Exception
	{
		//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https:/demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Identify WebElement
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		
		//Create object of select class
		Select sel=new Select(country);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		
		sel.selectByValue("INDIA");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("BAHAMAS");
		Thread.sleep(3000);
		
		/*
		// Select class with for loop
		List<WebElement>AllOptions=sel.getOptions();
		
		int list=AllOptions.size();
		System.out.println(list);
		
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
		*/
		
		//Browser close
		driver.close();
	}
}
