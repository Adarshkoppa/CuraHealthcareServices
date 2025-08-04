package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHome {
	WebDriver driver;
	@FindBy(xpath = "//a[.='Make Appointment']")
	private WebElement appointment;
	
	@FindBy(id  = "txt-username")
	private WebElement userName;
	
	@FindBy(xpath = "//button[@id='btn-login']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement userPassword;
	
	@FindBy(xpath = "//select[@id='combo_facility']")
	private WebElement facility;
	
	@FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
	private WebElement hospitalReadmission;
	
	@FindBy(xpath = "//input[@id='radio_program_medicare']")
	private WebElement Medicare;
	
	@FindBy(xpath = "//input[@id='radio_program_medicaid']")
	private WebElement Medicaid;
	
	@FindBy(xpath = "//input[@id='radio_program_none']")
	private WebElement None;
	
	@FindBy(xpath = "//input[@id='txt_visit_date']")
	private WebElement visit_Date;
	
	@FindBy(id = "txt_comment")
	private WebElement comment;
	
	@FindBy(id = "btn-book-appointment")
	private WebElement bookAppointment;

	@FindBy(xpath  = "//a[.='Go to Homepage']")
	private WebElement goHomepage;
	
	@FindBy(xpath = "//h2[.='Appointment Confirmation']")
	private WebElement confirmation;
	
	@FindBy(xpath = "//p[.='Login failed! Please ensure the username and password are valid.']")
	private WebElement errorMessage;
	
	public PomHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickAppointment()
	{
		appointment.click();
	}
	public void getUserName(String un)
	{
		userName.sendKeys(un);
	}
	public void getUserPassword(String pwd)
	{
		userPassword.sendKeys(pwd);
	}
	public void getLogin()
	{
		login.click();
	}
	public WebElement getFacility ()
	{
		return facility;
	}
	
	public void clickHospitalreadmission()
	{
		hospitalReadmission.click();
	}
	public void clickMedicareRadioButton()
		{
		Medicare.click();
		}
	public void clickMedicaidRadioButton()
	{
		Medicaid.click();
	}
	public void clickNoneRadioButton()
	{
		None.click();
	}
	public void getvisit_Date(String date)
	{
		visit_Date.sendKeys(date);
	}
	public void getComment(String details)
	{
		comment.sendKeys(details);
	}
	public void clickBookAppointment()
	{
		bookAppointment.click();
	}
	public void clickgoHomepage()
	{
		goHomepage.click();
	}
	public WebElement confirmationMessage()
	{
		return confirmation;
	}
	public WebElement getErrorMessage()
	{
		return errorMessage;
	}
	
}
