package Alert_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Without_SwitchTo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement Text_ID=driver.findElement(By.xpath("//input[@name='cusid']"));
		Text_ID.sendKeys("12345");
		
		WebElement Btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		Btn_submit.click();
		
		/*// Handle alert using Explicit wait
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		org.openqa.selenium.Alert alt= wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();
		
		String str=alt.getText();
		System.out.println(str);*/
		
		// Handle alert using JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try
		{
		js.executeScript("window.alert=function{};");
		}
		catch(Exception e)
		{
			
		}
	}

}
