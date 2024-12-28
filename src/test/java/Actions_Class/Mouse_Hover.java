package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {

	public static void main(String[] args)
	{
		// Browser Opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Create object on an Actions class
		Actions act=new Actions(driver);
		
		// Move to element + Click
		WebElement Selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		act.moveToElement(Selenium).click().build().perform();
		
	
		//Right Click
		WebElement Right_Click=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(Right_Click).build().perform();
		
		//Double Click
		WebElement Double_Click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Double_Click).build().perform();
		
		//Browser Close
		driver.quit();
		
	}

}
