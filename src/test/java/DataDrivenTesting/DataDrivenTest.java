package DataDrivenTesting;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DataDrivenTest
{

WebDriver driver;
	@BeforeClass
	public void setUp()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	}
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user,String pwd, String exp)
	{
		driver.get("https://practice.expandtesting.com/login");
		//System.out.println(driver.getTitle());
		WebElement txtEmail=driver.findElement(By.id("username"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();	// login button
		
		String exp_title="Secure Page page for Automation Testing Practice";
		
		String act_title=driver.getTitle();
		
		if(exp.equals("Valid"))
		{
			if( exp_title.equals(act_title))
			{
				driver.findElement(By.xpath("//a[@href='/logout']")).click();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid"))
		{
			if( exp_title.equals(act_title))
			{
				driver.findElement(By.xpath("//a[@href='/logout']")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
	}
	
	@DataProvider(name="LoginData")
	public  String [][] getData()
	{
		String logindata[][]={
								{"practice","SuperSecretPassword!","Valid"},
								{"practice","SuperSecretPassw","Invalid"},
								{"practic","SuperSecretPassw","Invalid"},
								{"practic","SuperSecretPassw","Invalid"}
							 };
		return logindata;
	}
	
@AfterClass
public void tearDown()
{
	driver.close();
}
}





