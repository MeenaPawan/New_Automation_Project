package DataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DP 
{
	
	@Test(dataProvider="logindata")
	public void logintest(String email,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();	
		WebElement Login_Btn=driver.findElement(By.xpath("//a[@class='ico-login']"));
		Login_Btn.click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
	boolean loginStatus;
	 try 
	 	{
		 	loginStatus=driver.findElement(By.xpath("//a[normalize-space()='Log out']")).isDisplayed();
		 	Assert.assertTrue(loginStatus);
	 	}
	 	catch(Exception e) 
	 		{
	 			loginStatus=false;
	 			Assert.assertTrue(loginStatus);
	 		}
	 		finally
	 			{
	 				driver.quit();
	 			}
	
		 
}
@DataProvider(parallel=true,indices={0,1})
public String[][] logindata()
  {
    String[][] data = {
		{"meenamahalle13@gmail.com","MeenaMahalle"},
		{"jane.smith1234@example.com","test12"},
		{"janeo.smithi1234@example.com","test1234"},
		{"jane.smith1234@example.com","test12"}
    };
    return data;
  }

}
