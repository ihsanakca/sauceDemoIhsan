package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void assertPageTitle(String pageTitle){
        Assert.assertEquals(pageTitle.toUpperCase(),Driver.get().findElement(By.
                xpath("//span[.='" + pageTitle + "']")).getText());
    }
}
