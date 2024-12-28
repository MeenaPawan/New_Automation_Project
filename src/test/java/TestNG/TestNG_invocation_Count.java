package TestNG;

import org.testng.annotations.Test;

public class TestNG_invocation_Count 
{
	@Test(invocationCount=2)
	public void A()
	{
	System.out.println("This is test a");	
	}
@Test(priority=1,invocationCount=3)
public void B()
{
	System.out.println("This is test b");
}
}
