package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public String PageTitle(String pageTitle){
        return Driver.get().findElement(By.
                xpath("//span[.='" + pageTitle + "']")).getText();
    }
}
