package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_Script {
	WebDriver driver;
@BeforeMethod
public void OpenApp()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
}

@Test
public void TestLogo()
{
	boolean status=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	System.out.println("Logo display...."+status);
	
	WebElement text=driver.findElement(By.xpath("	//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	System.out.println("Text...."+text.getText());
}
@Test
public void TestLogin()
{
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@123");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
	
}

@AfterMethod
public void CloseApp()
{
	driver.close();
}
}
