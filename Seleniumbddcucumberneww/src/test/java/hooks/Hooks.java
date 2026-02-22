package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import base.DriverFactory;
import utils.ConfigReader;
import utils.ScreenshotUtil;

public class Hooks {

	@Before
	public void setUp() {

	    String browser = ConfigReader.getProperty("browser");

	    DriverFactory.initDriver(browser);
	}

	@After
	public void tearDown(Scenario scenario) {

	    if (scenario.isFailed()) {

	        ScreenshotUtil.capture(
	            scenario.getName().replaceAll(" ", "_") +
	            "_" + Thread.currentThread().threadId()
	        );
	    }

	    DriverFactory.quitDriver();
	}
}
