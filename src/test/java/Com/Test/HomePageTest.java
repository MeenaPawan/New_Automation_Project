package Com.Test;

import org.testng.annotations.Test;

import Com.Utility.BaseClass;
import My_Task.HomePage;
import My_Task.RevenueCalculator;

public class HomePageTest extends BaseClass{
	@Test(priority = 1)
	public void validateTextToSlider() throws Exception {
		
		HomePage openHomepage = new HomePage(driver);
		openHomepage.navigateToHomePage();
		System.out.println("Home page opened");
		
		RevenueCalculator  revenue = new RevenueCalculator(driver);
		
		
		revenue.clickRevenueCalculater();
		
		revenue.inputTextForSlider();

		
		
		
	}
	
	
	@Test(priority = 2)
	public void validateRecurringAmount() throws Exception {
		
		HomePage openHomepage = new HomePage(driver);
		openHomepage.navigateToHomePage();
		System.out.println("Home page opened");
		
		RevenueCalculator  revenue = new RevenueCalculator(driver);
		
		
		revenue.clickRevenueCalculater();
		
		revenue.moveSlider();
		revenue.clickCheckBoxes();
		revenue.validateRecurringAmount();

		
	}
}


