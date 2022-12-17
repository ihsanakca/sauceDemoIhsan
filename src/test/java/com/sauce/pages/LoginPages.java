package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends BasePage{
    @FindBy(id = "user-name")
    public WebElement inputUsername_loc;

    @FindBy(id = "password")
    public WebElement inputPassword_loc;

    @FindBy(id = "login-button")
    public WebElement loginButton_loc;

    public void login_mtd(String username, String password){
        inputUsername_loc.sendKeys(username);
        inputPassword_loc.sendKeys(password);
        loginButton_loc.click();
    }
}
