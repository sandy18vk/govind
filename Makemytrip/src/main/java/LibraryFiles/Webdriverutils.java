package LibraryFiles;

import org.openqa.selenium.WebDriver;

public class Webdriverutils {
	
	private WebDriver driver;

	// Constructor to initialize WebDriver
	public  void WebDriverUtils(WebDriver driver) {
		this.driver = driver;
	}

	// Method to maximize the browser window
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	// Method to navigate to a URL
	public void openURL(String url) {
		driver.get(url);
	}

	// Method to refresh the page
	public void refreshPage() {
		driver.navigate().refresh();
	}

	// Method to close the browser
	public void closeBrowser() {
		driver.quit();
	}


}
