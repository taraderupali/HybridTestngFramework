package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverFactory;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage() {
        this.driver = DriverFactory.getDriver();
    }

    // Locators
    private By checkoutBtn = By.id("checkout");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By successMsg = By.className("complete-header");

    // Methods

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }

    public void enterCheckoutDetails(String fName, String lName, String zip) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(postalCode).sendKeys(zip);
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public boolean isOrderSuccessful() {
        return driver.findElement(successMsg)
                .getText()
                .equalsIgnoreCase("Thank you for your order!");
    }
}
