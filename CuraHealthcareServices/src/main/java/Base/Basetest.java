package Base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Basetest {
public WebDriver driver;

@BeforeClass
public void openApp() 
{
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    
	driver = new ChromeDriver(options);
	//driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	
 
}
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
