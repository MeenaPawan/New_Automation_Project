package ChildWindow_Handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow_Iterator {

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	
	String PWinAdd=driver.getWindowHandle();
	System.out.println(PWinAdd);
	
	WebElement Btn=driver.findElement(By.xpath("//a[text()='Click Here']"));
	Btn.click();
	
	Set<String> AllWinAdd=driver.getWindowHandles();
	System.out.println(AllWinAdd);
	
	Iterator<String> it=AllWinAdd.iterator();
	
	while(it.hasNext())
	{
		String CWinAdd=it.next();
		if(!PWinAdd.equals(CWinAdd))
		{
			driver.switchTo().window(CWinAdd);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12345");
			driver.close();
		}
	}
	driver.switchTo().window(PWinAdd);
	driver.close();
	
	}

}
