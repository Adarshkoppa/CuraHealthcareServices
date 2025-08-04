	package Base;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.text.SimpleDateFormat;
	import java.util.Date;

public class ScreenshotUtils {

	    public static String takeScreenshot(WebDriver driver, String testName) {
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String destPath = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timeStamp + ".png";

	        try {
	            File dest = new File(destPath);
	            Files.createDirectories(dest.getParentFile().toPath());
	            Files.copy(src.toPath(), dest.toPath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return destPath;
	    }
	}
