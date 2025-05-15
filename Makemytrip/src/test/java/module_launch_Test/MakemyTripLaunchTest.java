
package module_launch_Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LibraryFiles.Base_class;
import module1_pom.MakeMyTripLoginPage;
import module1_pom.MakeMyTripRootselection;

public class MakemyTripLaunchTest extends Base_class {

	MakeMyTripLoginPage launch;
	MakeMyTripRootselection rootwat;

	private static final Logger logger = LogManager.getLogger(MakemyTripLaunchTest.class);
	int TCID;

	@BeforeSuite
	public void setup() {
		createLogDirectory();
		logger.info("===== Test Suite Execution Started =====");
	}

	@BeforeClass

	public void openBrowser() {
		logger.info("------ Initializing Browser ------");

		try {
			launchBrowser();
			logger.info("Browser initialized successfully.");
			logger.info("Initialize Page Object after browser launch");

			launch = new MakeMyTripLoginPage(driver);

			logger.info("------ POM Objects created ------");
		} catch (IOException e) {
			logger.error("Error during browser initialization: ", e);
			e.printStackTrace();
		}

	}

	@Test

	public void Testlogin() {

		launch.windowClosed();
		launch.Traindisp();
		launch.fligts();

	}

}
