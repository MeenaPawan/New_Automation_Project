package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_enabled {
@Test(priority=1,enabled=false)   //-------------enabled=true default
public void A()
{
System.out.println("this is test a");	
}
@Test(priority=2)   
public void B()
{
System.out.println("this is test b");	
}
@Test(priority=3)  
public void C()
{
	Assert.assertTrue(false);      // true default
System.out.println("this is test c");
     
}

}
