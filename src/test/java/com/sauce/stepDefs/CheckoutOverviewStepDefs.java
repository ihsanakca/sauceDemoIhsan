package com.sauce.stepDefs;

import com.sauce.pages.CheckoutOverviewPage;
import com.sauce.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutOverviewStepDefs {
    CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage();

    @When("The user should be able to verify bill with Item Total")
    public void the_user_should_be_able_to_verify_bill_with_item_total() {
       checkoutOverviewPage.assertPurchaseWithItemTotal();
    }

    @And("The user should be able to click finish button and navigate to last page")
    public void theUserShouldBeAbleToClickFinishButtonAndNavigateToLastPage() {
        checkoutOverviewPage.clickFinishButton();
    }
}
