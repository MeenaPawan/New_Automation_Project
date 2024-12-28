package DropDown_Handle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library 
{
	public static void HandleDropDown(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}

}
