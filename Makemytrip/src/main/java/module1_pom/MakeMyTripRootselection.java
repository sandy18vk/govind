package module1_pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripRootselection {
	
	
	@FindBy(xpath = "//span[text()='From']")
	private WebElement fromcity;
	
	@FindBy(xpath = "//p[text()='Pune, India']")
	private WebElement cityname;
	
	@FindBy(xpath = "//span[text()='To']")
	private WebElement Tocity;
	
	@FindBy(xpath = "//p[text()='Goa - Dabolim Airport, India']")
	private WebElement tocityname;
	
		
	WebDriver driver;
	public MakeMyTripRootselection(WebDriver driver) {
		PageFactory.initElements(driver, this); // className.methodName(WebdriverObject, thisKeyword);
	     this.driver = driver;

	}
	
	
	public void fromdate() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(fromcity));
		fromcity.click();

	}
	
	public void fromdateselectCity() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(cityname));
		cityname.click();

	}

	public void Todate() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(Tocity));
		Tocity.click();

	}

	public void ToDateCityName() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(tocityname));
		tocityname.click();

	}
	
}
