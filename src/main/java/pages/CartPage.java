package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class CartPage extends BasePage {


    By firstProduct = By.xpath("//h5[@_ngcontent-ng-c127265017='' and contains(text(), 'Pliers')]");
    By secondProduct = By.xpath("//h5[@_ngcontent-ng-c127265017='' and contains(text(), 'Hammer')]");
    By addToCartButton = By.xpath("btn-add-to-cart");


    public CartPage(WebDriver driver) {
        super(driver);
    }



    public void addFirstProductsToCart()  {
        driver.findElement(firstProduct).click();
    }

    public void addSecondProductsToCart()  {
        driver.findElement(secondProduct).click();
    }

    public void clickOnButton(){
        driver.findElement(addToCartButton).click();
    }
}

