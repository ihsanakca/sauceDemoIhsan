package com.sauce.stepDefs;

import com.sauce.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartPageStepDefs {
    CartPage cartPage=new CartPage();

    @When("The user should be able to click checkout and navigate to checkout page")
    public void theUserShouldBeAbleToClickCheckoutAndNavigateToCheckoutPage() {
        cartPage.clickCheckout();
    }
}
