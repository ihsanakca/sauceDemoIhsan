package com.sauce.pages;

import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends BasePage {
    @FindBy(id = "user-name")
    public WebElement inputUsername_loc;

    @FindBy(id = "password")
    public WebElement inputPassword_loc;

    @FindBy(id = "login-button")
    public WebElement loginButton_loc;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElement leftTopMenuBtn_loc;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    public WebElement logoutBtn_loc;


    public void navigateToLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void login_mtd(String username, String password) {
        inputUsername_loc.sendKeys(username);
        inputPassword_loc.sendKeys(password);
        loginButton_loc.click();
    }

    public void turnToLoginPage() {
        leftTopMenuBtn_loc.click();
        logoutBtn_loc.click();
    }
}
