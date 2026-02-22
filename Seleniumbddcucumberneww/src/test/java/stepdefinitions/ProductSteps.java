package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.ProductPage;
import pages.CheckoutPage;

public class ProductSteps {

    ProductPage productPage = new ProductPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("User should see products page")
    public void verifyProductPage() {
        Assert.assertTrue(productPage.isProductPageDisplayed());
    }

    @When("User adds product to cart")
    public void addProduct() {
        productPage.addProductToCart();
        productPage.clickCartIcon();
    }

    @And("User completes checkout process")
    public void completeCheckout() {

        checkoutPage.clickCheckout();
        checkoutPage.enterCheckoutDetails("Rupali", "Tarade", "411001");
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();
    }

    @Then("Order should be placed successfully")
    public void verifyOrder() {
        Assert.assertTrue(checkoutPage.isOrderSuccessful());
    }
   

}
