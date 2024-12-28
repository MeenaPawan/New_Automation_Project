package Com.PageObject;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import Com.Utility.BaseClass;

public class HomePagePom extends BaseClass
{
	

	@FindBy(how=How.XPATH,using ="//a[@href='/home']")
	
	private WebElement homepageElement;
	
	public void navigateToHomePage() throws InterruptedException
	{
		homepageElement.click();
		Thread.sleep(5000);

	}

}



