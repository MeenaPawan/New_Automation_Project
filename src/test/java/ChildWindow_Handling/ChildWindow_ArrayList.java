package ChildWindow_Handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow_ArrayList {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String PWinAdd=driver.getWindowHandle();    // Parent window Address
		System.out.println(PWinAdd);
		
		WebElement Btn=driver.findElement(By.xpath("//a[text()='Click Here']"));
		Btn.click();
		
		Set<String> AllWinAdd=driver.getWindowHandles();	// All window Address
		System.out.println( AllWinAdd);
		
		List<String>list=new ArrayList<String>(AllWinAdd);
		list.get(0);   				// Parent window Address
		String CWinAdd=list.get(1);	 // Child window Address
		System.out.println(CWinAdd);
		
		driver.switchTo().window(CWinAdd);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12345");
		
		driver.switchTo().window(PWinAdd);
		driver.quit();
	}

}
