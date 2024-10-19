package TestNG;

import org.testng.annotations.Test;

public class TestNG_Keywords 
{
	/*
	 1) Open app
	 2) Login
	 3) Logout
	 */
	@Test(priority=1)
	public void Openapp()
	{
	System.out.println("Opening Application.........");	
	}
	
	@Test(priority=2)
	public void Login()
	{
	System.out.println("Login to Application..........");	
	}
	
	@Test(priority=3)
	public void LogOut()
	{
	System.out.println("Logout the Application.........");	
	}
}
