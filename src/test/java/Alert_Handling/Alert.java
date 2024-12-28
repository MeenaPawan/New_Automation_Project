package Alert_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement Text_ID=driver.findElement(By.xpath("//input[@name='cusid']"));
		Text_ID.sendKeys("12345");
		
		WebElement Btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		Btn_submit.click();
		
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		
		String str1=alt.getText();
		System.out.println(str1);
		
		// Accept the alert
		alt.accept();
		Thread.sleep(3000);
		
		//Dismiss alert
		String str2=alt.getText();
		System.out.println(str2);
		alt.dismiss();
	}

}
