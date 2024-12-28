package TestNG;

import org.testng.annotations.Test;

public class TestNG_groups 
{
@Test(priority=1,groups= {"Sanity"})
public void OpenApp()
{
System.out.println("This is OpenApp...");
}

@Test(priority=2,groups= {"Sanity"})
public void SignUp()
{
System.out.println("This is SignUp...");
}

@Test(priority=3,groups= {"Regration"})
public void Login()
{
System.out.println("This is Login...");
}

@Test(priority=4,groups= {"Regration"})
public void LoginByMail()
{
System.out.println("LoginByMail...");
}

@Test(priority=5,groups= {"Functional"})
public void LoginByFacebook()
{
System.out.println("LoginByFacebook...");
}

@Test(priority=6,groups= {"Functional"})
public void LogOut()
{
System.out.println("This is LogOut...");

}
}
