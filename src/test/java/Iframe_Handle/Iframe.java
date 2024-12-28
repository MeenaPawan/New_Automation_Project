package Iframe_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.automationtesting.in/Frames.html");
	    driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// MainPage to Frame 1----------------By Index
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.xpath("//input[@name='mytext1']"));
		frame1.sendKeys("1234");
		
		//Frame1 to MainPage
		driver.switchTo().defaultContent();
		
		// MainPage to Frame2----------------By String Name
		driver.switchTo().frame("Frame2");
		WebElement frame2=driver.findElement(By.xpath("//input[@name='mytext2']"));
	    frame2.sendKeys("test");
	    
	  //Frame2 to MainPage
	  driver.switchTo().defaultContent();
	  
	  // MainPage to Frame3----------------By Using WebElement (XPATH)
		driver.switchTo().frame("//input[@name='mytext3']");
		
	    
	}

}
