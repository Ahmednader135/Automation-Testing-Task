package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ShoppingCard extends MethodHandles {

    public ShoppingCard(WebDriver driver) {
        super(driver);
    }

    private final By cardInfo = By.xpath("//a[contains(text(),'Thinking in HTML')]");
    private final By proceedToCheckout = By.xpath("//a[contains(text(),'Proceed to Checkout')]");


    public boolean validateCardInfo(){

        return isDisplayed(cardInfo,5);
    }
    public Checkout clickOnProceedToCheckoutButton() {
        scrollIntoView(driver,webElement(proceedToCheckout));
        click(proceedToCheckout, 5);
        return new Checkout(driver);
    }
}
