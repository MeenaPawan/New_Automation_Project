package My_Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {
	public static  WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		
WebDriverManager.chromedriver().setup();

driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
 
WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
Demo2.ExcelData(SearchBox, "Sheet1", 0, 0);
}
}
/*
WebElement SearchBtn=driver.findElement(By.xpath("WebElement SearchBox=driver.findElement(By.xpath(\"//input[@id='twotabsearchtextbox']\"));"));
SearchBtn.click();

WebElement AddToCart=driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
AddToCart.clear();

/*WebElement SignUp=driver.findElement(By.xpath("//input[@id='ap_email']"));
SignUp.sendKeys("");*/
	


