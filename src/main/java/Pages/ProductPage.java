package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by opop on 12/12/2016.
 */
public class ProductPage  {

    By ProductPriceLocator = By.cssSelector(".val.js-current-price");
    By AddToCardLocator = By.cssSelector(".add-to-cart.btn.btn-60.s-yellow.js-add-to-cart");
    By countinueShopping = By.cssSelector(".btn.btn-48.s-grey.left.close.js-close-pop-up");
    By Card = By.cssSelector("#js-show-pop-up-basket");
    By goToCard = By.xpath(".//*[@id='js-modal-pop-up']/div[2]/div/a");


    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public Double getProductPrice(){
        String priceText = driver.findElement(ProductPriceLocator).getText();
        priceText = priceText.replaceAll("\\,|\\ |\\$","");
        Double price = Double.parseDouble(priceText);
        System.out.println("========================"+price);
        return price;
    }

    public void clickOnAddToCard() throws InterruptedException {
            driver.findElement(AddToCardLocator).click();
            Thread.sleep(3000);
            driver.findElement(countinueShopping).click();
    }

    public CardPage goToCardPage() throws InterruptedException {
        driver.findElement(Card).click();
        driver.findElement(goToCard).click();
        Thread.sleep(3000);
        return  new CardPage(driver);
    }
}


