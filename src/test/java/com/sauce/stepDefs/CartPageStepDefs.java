package com.sauce.stepDefs;

import com.sauce.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartPageStepDefs {
    CartPage cartPage=new CartPage();
    @Then("The user should be able to verify being on the page by using page title {string}")
    public void the_user_should_be_able_to_verify_being_on_the_page_by_using_page_title(String pageTitle) {
       Assert.assertEquals(pageTitle.toUpperCase(),cartPage.PageTitle(pageTitle));
    }
    @When("The user should be able to click checkout and navigate to checkout page")
    public void theUserShouldBeAbleToClickCheckoutAndNavigateToCheckoutPage() {
        cartPage.clickCheckout();
    }
}
