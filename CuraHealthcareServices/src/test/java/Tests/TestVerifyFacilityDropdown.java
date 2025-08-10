package Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Basetest;
import Pages.PomHome;

public class TestVerifyFacilityDropdown extends Basetest {
	@Test
	public void testVerifyFacilityOptionDDM()
	{
		 // Login
		PomHome p=new PomHome(driver);
		p.clickAppointment();
		p.getUserName("John Doe");
		p.getUserPassword("ThisIsNotAPassword");
		p.clickLogin();
		
		// Facility dropdown
		Select fecility=new Select(p.facility);
		for (WebElement option : fecility.getOptions()) 
		{
			System.out.println("option:"+option.getText());
			
		}
		fecility.getOptions();
			
}}