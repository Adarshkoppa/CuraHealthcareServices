package Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.Basetest;
import Pages.PomHome;
import Reports.ExtentTestNGListener;

@Listeners(ExtentTestNGListener.class)
public class TestvalidLogin extends Basetest {
	
	@Test
public void testValidLogin() 
	{
	PomHome p = new PomHome(driver);	
	p.clickAppointment();
	p.getUserName("John Doe");
	p.getUserPassword("ThisIsNotAPassword");
	try {
		Thread.sleep(2000);
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	p.clickLogin();

	String title = driver.getTitle();
	System.out.println(title);
}

}
