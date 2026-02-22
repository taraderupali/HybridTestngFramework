package stepdefinitions;

import io.cucumber.java.en.*;
import base.DriverFactory;
import pages.LoginPage;
import utils.ConfigReader;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginSteps {

    private static final Logger logger =
            LogManager.getLogger(LoginSteps.class);

    private WebDriver driver;
    private LoginPage loginPage;

    // Load config only once
    private static ConfigReader config = new ConfigReader();

    @Given("User launches application")
    public void launchApp() {

        logger.info("Initializing WebDriver for thread: "
                + Thread.currentThread().getId());

        driver = DriverFactory.getDriver();

        if (driver == null) {
            logger.error("Driver is NULL. Check DriverFactory initialization.");
            throw new RuntimeException("Driver not initialized!");
        }

        logger.info("Launching URL: " + config.getUrl());

        driver.get(config.getUrl());

        loginPage = new LoginPage(driver);

        logger.info("Application launched successfully.");
    }

    @When("User logs in with valid credentials")
    public void login() {

        logger.info("Logging in with valid credentials");

        loginPage.login(
                config.getUsername(),
                config.getPassword()
        );

        logger.info("Login action performed successfully.");
    }
}