package Com.Test;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Utility.BaseClass;

public class SliderTest extends BaseClass{
	 public static WebDriver driver;
	  public Map<String, Object> vars;
	  JavascriptExecutor js;
	
	  @Test
	  public void slider() 
	  {
	  //  driver.get("https://www.fitpeo.com/");
	 //   driver.manage().window().setSize(new Dimension(1280, 800));
	    driver.findElement(By.cssSelector(".MuiBox-root:nth-child(6) > a > .satoshi")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".MuiBox-root:nth-child(6) > a > .satoshi"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    js.executeScript("window.scrollTo(0,91)");
	    js.executeScript("window.scrollTo(0,502)");

	    driver.findElement(By.id(":r0:")).click();
	    driver.findElement(By.id(":r0:")).sendKeys("820");

	    
	    {
	      String value = driver.findElement(By.id(":r0:")).getAttribute("value");
	     // assertThat(value, is("820"));
	      System.out.println(" value -"+value);
	    }
	  }
}
