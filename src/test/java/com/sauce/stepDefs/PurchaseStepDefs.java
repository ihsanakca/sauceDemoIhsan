package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import com.sauce.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class PurchaseStepDefs {

    ProductPage productPage = new ProductPage();

    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String sortBy) {
        productPage.sortProduct(sortBy);
    }

    @And("The user should be able to select the product by using price: {string}")
    public void theUserShouldBeAbleToSelectTheProductByUsingPrice(String price) {
        productPage.selectProductwithPrice(price);
    }

    @And("The user should be able to go to your cart page")
    public void theUserShouldBeAbleToGoToYourCartPage() {
        productPage.goToCart();
        BrowserUtils.waitFor(2);
    }

    @And("The user should be able to select the product by using index No: {string}")
    public void theUserShouldBeAbleToSelectTheProductByUsingIndexNo(String indexNo) {
        productPage.selectProductWithIndexNumber(indexNo);
        BrowserUtils.waitFor(3);
    }
}
