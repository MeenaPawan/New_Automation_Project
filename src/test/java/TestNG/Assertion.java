package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
	@Test
	public void Hard_Assertion()
	{
	String Expected="Opencart";
	String Actual="Opencar";
	
	System.out.println("This is first Test");
	System.out.println("This is second Test");
	
	Assert.assertEquals(Expected, Actual);
	
	System.out.println("This is last Test");
	}
	@Test
	public void Soft_Assertion()
	{
	String Expected="Opencart";
	String Actual="Opencar";
	
	System.out.println("This is first Test");
	System.out.println("This is second Test");
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(Expected, Actual);
	
	System.out.println("This is last Test");
	sa.assertAll();
	}
}
