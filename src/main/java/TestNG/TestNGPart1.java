package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGPart1 {

	@Test(priority=1)
	 
	void A()

	{
		System.out.println("Method A");
	}
	@Test(priority=2)
	void B() 
	{
		System.out.println("Method B");
	}
	@Test(priority=3)
	void C() 
	{
		System.out.println("Method C");
	}
	@Test(priority=4)
	void D() 
	{
		System.out.println("Method D");
	}
}
