package module_launch_Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import AutomationReports.ExtentManager;
import LibraryFiles.Base_class;

import module1_pom.MakeMyTripLoginPage;
import module1_pom.MakeMyTripRootselection;

public class MakeMyTripRootselectionTest extends Base_class {
	
	MakeMyTripLoginPage launch;
	MakeMyTripRootselection rootway;
	
	private static final Logger logger = LogManager.getLogger(MakeMyTripRootselectionTest.class);
	int TCID;
	
	
	@BeforeSuite
	public void setup() {
		createLogDirectory();
		logger.info("===== Test Suite Execution Started =====");
	}

	@BeforeClass
	
	public void cityslection() {
		logger.info("------ Initializing Browser ------");
		try {
			launchBrowser();
			logger.info("Browser initialized successfully.");
			logger.info("Initialize Page Object after browser launch");
			
			launch = new MakeMyTripLoginPage(driver);
			rootway= new MakeMyTripRootselection(driver);
			
			
			logger.info("------ POM Objects created ------");
		} catch (IOException e) {
			logger.error("Error during browser initialization: ", e);
			e.printStackTrace();
		}
	}
		
		@BeforeMethod
		public void loginToApp() {
			launch.windowClosed();
			launch.Traindisp();
			launch.fligts();
		}
		
		
		@Test

		public void Testlogin() {

			rootway.fromdate();
			rootway.fromdateselectCity();
			rootway.Todate();
			rootway.ToDateCityName();
		}

		@AfterSuite
		
		public void closed() {
			driver.quit();
		}
		
}
