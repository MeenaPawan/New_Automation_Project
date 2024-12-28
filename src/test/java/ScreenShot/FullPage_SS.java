package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class FullPage_SS {

	public static void main(String[] args) throws Exception 
	{
	// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// FullPage ScreenShot
		
		String rm=RandomString.make(3);
		
		//String path="C:\Users\DELL\eclipse-workspace\AUTOMATION_PROJECT\ScreenShots";
		String path=System.getProperty("user.dir");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"\\ScreenShots\\"+rm+".png");
		
		FileUtils.copyFile(src, dest);
		
	}

}
