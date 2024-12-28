package My_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	public static void main(String[] args) 
	{
		// Browser Setup and Opening Code
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://fitpeo.com/");
				driver.manage().window().maximize();
				
				driver.navigate().to("https://fitpeo.com/revenue-calculator");
				
				// Scroll
				JavascriptExecutor js=(JavascriptExecutor)driver;
			
				WebElement Scroll_Element=driver.findElement(By.xpath("//span[text()='Patients should be between 0 to 2000']"));
				js.executeScript("arguments[0].scrollIntoView();",Scroll_Element);
				
				
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
				/*
				// Slider move
				
				Actions act=new Actions(driver);
				WebElement slider=driver.findElement(By.xpath("//input[@style='border:0;clip:rect(0 0 0 0);height:100%;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:100%;direction:ltr']"));
				//WebElement slider=driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']"));
				
				//WebElement slider=driver.findElement(By.xpath("//input[@aria-valuenow='820']"));
				System.out.println("Default location of the slider :"+slider.getLocation()); //718,663
				
				System.out.println(" "+slider.getSize());
				
				
				act.dragAndDropBy(slider, 94, 0).perform();
				
				
				System.out.println("Location of the slider after moving :"+slider.getLocation());
				
				
						
	
				
				
				// Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Create object on an Actions class
				Actions act=new Actions(driver);
				
				// Move to element + Click
				WebElement Selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
				act.moveToElement(Selenium).click().build().perform();*/
	}


