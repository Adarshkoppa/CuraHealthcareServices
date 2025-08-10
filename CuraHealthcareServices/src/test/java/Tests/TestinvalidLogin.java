package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.Basetest;
import Pages.PomHome;

public class TestinvalidLogin extends Basetest {
	@Test
	public void testinValidLogin() 
		{
		PomHome p = new PomHome(driver);	
		p.clickAppointment();
		p.getUserName("John Doe");
		p.getUserPassword("ThisIsAPassword");
		p.clickLogin();
		try {Thread.sleep(2000);}
		catch (Exception e) 
		{e.printStackTrace();}
		Assert.assertTrue(p.getErrorMessage().isDisplayed(),"error message is not displayed");
	}

}
