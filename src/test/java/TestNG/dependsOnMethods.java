package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test(priority=1)
	public void OpenApp()
	{
		Assert.assertTrue(true);
		System.out.println("This is Open App....");
	}
	
	@Test(priority=2,dependsOnMethods= {"OpenApp"})
	public void Login()
	{
		Assert.assertTrue(true);
		System.out.println("This is Login....");
	}
	
	@Test(priority=3,dependsOnMethods= {"Login"})
	public void Search()
	{
		Assert.assertTrue(false);
		System.out.println("This is Search....");
	}
	
	@Test(priority=4,dependsOnMethods= {"Login","Search"})
	public void AdvSearch()
	{
		Assert.assertTrue(true);
		System.out.println("This is AdvSearch....");
	}
	
	@Test(priority=5,dependsOnMethods= {"Login"})
	public void LogOut()
	{
		Assert.assertTrue(true);
		System.out.println("This is LogOut....");
	}
	
}
