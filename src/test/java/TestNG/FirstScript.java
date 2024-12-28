package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript
{
	WebDriver driver;
	@Test(priority=1)
	public void OpenApp()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println("Application open.......");
	}

	@Test(priority=2)
	public void TestLogo() throws Exception
	{
	Thread.sleep(3000);
	boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("Logo is Displayed......."+status);
	
	WebElement text=driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));
	System.out.println("Test is......."+text.getText());
	
	}
	
	@Test(priority=3)
	public void TestLogin()
	{
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	System.out.println("User name and password successfully added......");
	}
	
	@Test(priority=4)
	public void CloseApp()
	{
	driver.close();
	System.out.println("Application close........");
	}
}
