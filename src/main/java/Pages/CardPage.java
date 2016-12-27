package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by opop on 12/12/2016.
 */
public class CardPage {
    private WebDriver driver;

    public CardPage(WebDriver driver){
       this.driver = driver;
    }

    By subtotalValueofOrder = By.cssSelector(".val.js-pre-order-amount");

    public double getSubtotalValue(){
        String totalPrice = driver.findElement(subtotalValueofOrder).getText();
        totalPrice = totalPrice.replaceAll("\\,|\\$|\\ ","");
        System.out.print("========================"+totalPrice);
        return Double.parseDouble(totalPrice);

    }
}
