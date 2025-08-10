package Tests;

import org.testng.annotations.Test;

import Base.Basetest;
import Pages.PomHome;


public class TestHomepageUIelements extends Basetest{
	@Test
public void testHomepageUIelements() {
	PomHome p=new PomHome(driver);
	p.getLogo().isDisplayed();
    // Verify Logo
    System.out.println("Logo displayed");

    // Verify Make Appointment button
    p.appointment.isDisplayed();
    p.clickAppointment();
    System.out.println("Make Appointment button displayed");

}}
