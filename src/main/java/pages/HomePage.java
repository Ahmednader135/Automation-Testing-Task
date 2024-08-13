package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By html = By.xpath("//img[@alt='Thinking in HTML']");
    private final By addToBasket = By.xpath("//a[@data-product_id='163']");
    private final By shoppingCard = By.cssSelector("#wpmenucartli");

   public void clickOnAddToBasketButton(){
       scrollIntoView(driver,webElement(html));
       click(addToBasket,5);
   }

    public ShoppingCard clickOnShoppingCardButton(){
        scrollIntoView(driver,webElement(shoppingCard));
        click(shoppingCard,5);
        return new ShoppingCard(driver);
    }

    public boolean validateHtmlBook(){
       scrollIntoView(driver,webElement(html));
       return isDisplayed(html,5);
    }




}
