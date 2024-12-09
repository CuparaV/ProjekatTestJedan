package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.LoginPage;
import pages.RegisterPage;

public class CartTest extends BaseTest{

    CartPage cartPage;
    LoginPage loginPage;

    @BeforeMethod
    public void loginSetup() {
        cartPage = new CartPage(driver);

    }

    @Test()
    public void addItem() throws InterruptedException {
//        cartPage.goToLandingPage();
        cartPage.addProductsToCart();
        Thread.sleep(5000000);

    }



}
