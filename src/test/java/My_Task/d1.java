package My_Task;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d1 {

		public static  WebDriver driver;
		public static void main(String[] args) throws Exception 
		{
			
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	 
	
	String path="C:\\Users\\DELL\\eclipse-workspace\\AUTOMATION_PROJECT\\ExcelData\\TestData.xlsx";
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	String str=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	SearchBox.sendKeys(str);
	
	
	/*WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//element.sendKeys(str);
	
	WebElement SearchBtn=driver.findElement(By.xpath("WebElement SearchBox=driver.findElement(By.xpath(\"//input[@id='twotabsearchtextbox']\"));"));
	SearchBtn.click();

	WebElement AddToCart=driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
	AddToCart.clear();

	WebElement SignUp=driver.findElement(By.xpath("//input[@id='ap_email']"));
	SignUp.sendKeys("");*/
		


		}
}
