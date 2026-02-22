package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverFactory;

public class ProductPage {

    private WebDriver driver;

    public ProductPage() {
        this.driver = DriverFactory.getDriver();
    }

    // Locators
    private By productsTitle = By.className("title");
    private By addBackpackBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    // Methods

    public boolean isProductPageDisplayed() {
        return driver.findElement(productsTitle)
                .getText()
                .equalsIgnoreCase("Products");
    }

    public void addProductToCart() {
        driver.findElement(addBackpackBtn).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }
}
