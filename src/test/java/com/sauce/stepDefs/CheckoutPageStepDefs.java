package com.sauce.stepDefs;

import com.sauce.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageStepDefs {
    CheckoutPage checkoutPage=new CheckoutPage();
    @When("The user should be able to fill the form by using {string} {string} and {string}")
    public void the_user_should_be_able_to_fill_the_form_by_using_and(String name, String lastname, String postalCode) {
    checkoutPage.fillCheckoutForm(name,lastname,postalCode);
    }

    @And("The user should be able to click continue and navigate to checkout overview page")
    public void theUserShouldBeAbleToClickContinueAndNavigateToCheckoutOverviewPage() {
        checkoutPage.clickContinue();
    }
}
