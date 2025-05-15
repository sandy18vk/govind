package module1_pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripLoginPage {
	
	// Step1: declaration
	@FindBy(css = "span.commonModal__close")
	private WebElement closepopup;
	
	@FindBy(xpath = "(//span[text()='Trains'])[1]")
    private WebElement train;
	
	@FindBy(xpath="(//span[text()='Flights'])[1]")
	private WebElement filght;
	

	WebDriver driver;
	// initialization

	public MakeMyTripLoginPage(WebDriver driver) {
		
			PageFactory.initElements(driver, this); // className.methodName(WebdriverObject, thisKeyword);
		     this.driver = driver;
	}
	
	public void windowClosed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		closepopup.click();
	}

   public void Traindisp() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(train));
		train.click();
   }
   
   public void fligts() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(filght));
		filght.click();

	}


}