package UploadFile;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass_UploadFile {
	  public static void main(String[] args) throws Exception 
	  {
		 
		      WebDriverManager.chromedriver().setup();
		      WebDriver driver = new ChromeDriver();
		      driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
		      driver.manage().window().maximize();
		      
		      //identify element and click
		      driver.findElement(By.xpath("//span[@class='browse']")).click();
		      
		      //Robot object creation
		      Robot r = new Robot(); 
		      r.delay(2000);
		      
		      // file path passed as parameter to StringSelection
		      StringSelection s = new StringSelection("G:\\My data\\Resume.pdf");
		      Thread.sleep(3000);
		      
		      // Clip board copy
		      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		      //Thread.sleep(3000);
		      
		    //pressing enter
		      r.keyPress(KeyEvent.VK_ENTER);
		      //releasing enter
		      r.keyRelease(KeyEvent.VK_ENTER);
		      //pressing ctrl+v
		      r.keyPress(KeyEvent.VK_CONTROL);
		      r.keyPress(KeyEvent.VK_V);
		      //releasing ctrl+v
		      r.keyRelease(KeyEvent.VK_CONTROL);
		      r.keyRelease(KeyEvent.VK_V);
		      Thread.sleep(3000);
		      
		      //pressing enter
		      r.keyPress(KeyEvent.VK_ENTER);
		      //releasing enter
		      r.keyRelease(KeyEvent.VK_ENTER);
		      Thread.sleep(3000);
		      
		      driver.close();
		      /* 
		      // scroll to reach upload button
		      JavascriptExecutor j = (JavascriptExecutor)driver;
		      j.executeScript("scroll(0,500)");
		      
		      WebElement browse_Btn=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		      //browse_Btn.click();
		      j.executeScript("arguments[0].click();", browse_Btn);
		      
		     // file path passed as parameter to StringSelection
		      StringSelection s = new StringSelection("D:\\My data\\Resume.pdf");
		   */
	}

}
