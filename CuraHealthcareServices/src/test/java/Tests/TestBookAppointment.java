package Tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;
import Pages.PomHome;

public class TestBookAppointment extends Basetest {
	@Test
	public void testBookAppointment() 
		{
		
		PomHome p1 = new PomHome(driver);
		p1.clickAppointment();
		p1.getUserName("John Doe");
		p1.getUserPassword("ThisIsNotAPassword");
		p1.clickLogin();

		Select faciltyDDM = new Select(p1.getFacility()); 
		faciltyDDM.selectByVisibleText("Hongkong CURA Healthcare Center");
		p1.clickHospitalreadmission();
		p1.clickMedicaidRadioButton();
		p1.getvisit_Date("30/08/2025");
		p1.getComment("PlasticSurgery");
		p1.clickBookAppointment();
		try 
		{
		Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		Assert.assertTrue(p1.confirmationMessage().isDisplayed(),"Confirmation message is not displayed");
		
		/*
		WebElement confirmMessage = driver.findElement(By.xpath("//h2[.='Appointment Confirmation'"));
		Assert.assertEquals(confirmMessage,"Appointment Confirmation","appointment Booking is failed");*/

	}

}
