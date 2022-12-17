package com.sauce.pages;

import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productHeader_loc;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement productSortMenu_loc;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> productPrices_loc;

//    @FindBy(xpath = "//button[starts-with(@class,'btn')]/..")
//    public List<WebElement> buttons_loc;

    @FindBy(xpath = "(//button[starts-with(@class,'btn')])[1]")
    public List<WebElement> buttons_loc;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement goToCartButton_loc;

    public static Double sum=0.0;

    public void sortProduct(String sortingText){
        Select select=new Select(productSortMenu_loc);
        select.selectByVisibleText(sortingText);
    }

   public void selectProductwithPrice(String price){
       List<String> prices = BrowserUtils.getElementsText(productPrices_loc);
       List<Double> priceDbl = new ArrayList<>();
       for (String p : prices) {
           priceDbl.add(Double.parseDouble(p.substring(1)));
       }
       double priceDouble = Double.parseDouble(price);
       for (Double db : priceDbl) {
           if (db == priceDouble) {
               sum+=db;
               clickProduct(priceDbl.indexOf(db)+1);
               BrowserUtils.waitFor(2);
           }
       }
   }
    public void clickProduct(int index){
        Driver.get().findElement(By.xpath("(//button[starts-with(@class,'btn')])["+index+"]")).click();
    }
   public void goToCart(){
       goToCartButton_loc.click();
   }
}
