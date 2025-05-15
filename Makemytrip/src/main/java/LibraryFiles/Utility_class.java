package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class {
	
	
	public static void captureSS(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "\\Screenshot2\\" + TCID + ".jpg");
		FileHandler.copy(src, dest);
	}

	
	public static String getPFData(String key) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\PropertyFile.properties");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}

}
