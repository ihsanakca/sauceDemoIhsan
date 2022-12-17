package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage{
    @FindBy (xpath = "//div[@class='summary_subtotal_label']")
    public WebElement itemTotal_loc;

    @FindBy(xpath = "//button[.='Finish']")
    public WebElement finishBtn_loc;

    public Double getItemTotal(){
        return Double.parseDouble(itemTotal_loc.getText().substring(13));
    }
    public void clickFinishButton(){
        finishBtn_loc.click();
    }
}
