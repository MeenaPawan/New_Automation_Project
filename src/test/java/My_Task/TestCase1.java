package My_Task;

import org.testng.annotations.Test;

public class TestCase1 extends BaseClass{
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

