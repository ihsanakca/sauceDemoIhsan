package com.sauce.stepDefs;

import com.sauce.pages.LoginPages;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPages loginPages = new LoginPages();
    ProductPage productPage = new ProductPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPages.navigateToLoginPage();
    }

    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        loginPages.login_mtd(username, password);
    }

    @Then("The user should be able to verify being on the page by using page title {string}")
    public void the_user_should_be_able_to_verify_being_on_the_page_by_using_page_title(String pageTitle) {
        loginPages.assertPageTitle(pageTitle);
    }

    @When("The user turns to login page")
    public void theUserTurnsToLoginPage() {
        loginPages.turnToLoginPage();
    }
}
