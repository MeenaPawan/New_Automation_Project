package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		
		act.keyDown(Email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		
		login.sendKeys(Keys.ENTER);
		driver.close();
	}

}
