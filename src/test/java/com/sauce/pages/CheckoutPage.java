package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    Actions actions = new Actions(Driver.get());

    @FindBy(id = "first-name")
    public WebElement firstName_loc;

    @FindBy(id = "last-name")
    public WebElement lastname_loc;

    @FindBy(id = "postal-code")
    public WebElement postalCode_loc;

    @FindBy(id = "continue")
    public WebElement continueBtn_loc;

    public void fillCheckoutForm(String name, String lastname, String postalCode) {
        actions.click(firstName_loc)
                .sendKeys(name + Keys.TAB)
                .sendKeys(lastname + Keys.TAB)
                .sendKeys(postalCode).perform();
    }
    public void clickContinue(){
        continueBtn_loc.click();
    }
}
