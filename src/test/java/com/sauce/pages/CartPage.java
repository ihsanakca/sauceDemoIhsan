package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(id = "checkout")
    public WebElement checkoutBtn_loc;

    @FindBy (xpath = "//span[.='Your Cart']")
    public WebElement cartPageTitle_loc;

    public void clickCheckout(){
        checkoutBtn_loc.click();
    }


}
