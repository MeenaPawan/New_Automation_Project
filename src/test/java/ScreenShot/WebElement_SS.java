package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_SS {

	public static void main(String[] args) throws Exception
	{
		// Browser Open
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				
				// ScreenShot of WebElement
				
				WebElement LoginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
				String path=System.getProperty("user.dir");
				
				File src=LoginButton.getScreenshotAs(OutputType.FILE);
				File dest=new File(path+"\\ScreenShots\\Login.png");
				FileUtils.copyFile(src, dest);
				
				driver.close();
	}

}
