package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class Checkout extends MethodHandles {

    public Checkout(WebDriver driver) {
        super(driver);
    }
    private final By billingDetails = By.xpath("//*[@id=\"customer_details\"]/div[1]/div/h3");

    public boolean validateBillingDetails(){
        return isDisplayed(billingDetails,5);
    }
}
