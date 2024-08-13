package checkout;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Checkout;
import pages.HomePage;
import pages.ShoppingCard;

public class CheckoutTest extends BaseTests {

    @Test(priority =1)
    public void assertingThinkinginHTML_TC(){
        boolean resultHtmlBook = homePage.validateHtmlBook();
        if (resultHtmlBook) {
            System.out.println("HTML book exists along with its price");
        }
        else{
            System.out.println("HTML book doesn't exists along with its price");
        }
    }
    @Test(priority =2)
    public void addtoBasketforThinkinginHTML_TC(){
        boolean resultHtmlBook = homePage.validateHtmlBook();
        if (resultHtmlBook) {
            System.out.println("HTML book exists along with its price");
            homePage.clickOnAddToBasketButton();
        }
        else{
            System.out.println("HTML book doesn't exists along with its price");
        }
    }
    @Test(priority =3)
    public void shoppingCart_TC(){
        boolean resultHtmlBook = homePage.validateHtmlBook();
        if (resultHtmlBook) {
            System.out.println("HTML book exists along with its price");
            homePage.clickOnAddToBasketButton();
            ShoppingCard shoppingCard = homePage.clickOnShoppingCardButton();
        }
        else{
            System.out.println("HTML book doesn't exists along with its price");
        }
    }
    @Test(priority =4)
    public void assertingItemaddedtothecart_TC(){
        boolean resultHtmlBook = homePage.validateHtmlBook();
        if (resultHtmlBook) {
            System.out.println("HTML book exists along with its price");
            homePage.clickOnAddToBasketButton();
            ShoppingCard shoppingCard = homePage.clickOnShoppingCardButton();
            boolean resultCardInfo = shoppingCard.validateCardInfo();
            if (resultCardInfo){
                System.out.println("Item added successfully to the cart with its details");
            }
            else {
                System.out.println("Wrong data added to the cart with its details");
            }
        }
        else{
            System.out.println("HTML book doesn't exists along with its price");
        }
    }
    @Test(priority =5)
    public void proceedtoCheckout_TC(){
        boolean resultHtmlBook = homePage.validateHtmlBook();
        if (resultHtmlBook) {
            System.out.println("HTML book exists along with its price");
            homePage.clickOnAddToBasketButton();
            ShoppingCard shoppingCard = homePage.clickOnShoppingCardButton();
            boolean resultCardInfo = shoppingCard.validateCardInfo();
            if (resultCardInfo){
                System.out.println("Item added successfully to the cart with its details");
                Checkout checkout = shoppingCard.clickOnProceedToCheckoutButton();
            }
            else {
                System.out.println("Wrong data added to the cart with its details");
            }
        }
        else{
            System.out.println("HTML book doesn't exists along with its price");
        }
    }
    @Test(priority =6)
    public void assertingBillingDetails_TC(){
        boolean resultHtmlBook = homePage.validateHtmlBook();
        if (resultHtmlBook) {
            System.out.println("HTML book exists along with its price");
            homePage.clickOnAddToBasketButton();
            ShoppingCard shoppingCard = homePage.clickOnShoppingCardButton();
            boolean resultCardInfo = shoppingCard.validateCardInfo();
            if (resultCardInfo){
                System.out.println("Item added successfully to the cart with its details");
                Checkout checkout = shoppingCard.clickOnProceedToCheckoutButton();
                boolean resultBillingDetails = checkout.validateBillingDetails();
                if (resultBillingDetails)
                {
                    System.out.println("Billing Details form displayed successfully");
                }
                else {
                    System.out.println("Billing Details form is not displayed successfully");
                }
            }
            else {
                System.out.println("Wrong data added to the cart with its details");
            }
        }
        else{
            System.out.println("HTML book doesn't exists along with its price");
        }
    }
}
