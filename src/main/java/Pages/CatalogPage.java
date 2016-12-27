package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private WebDriver driver;

     public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage klickOnProduct(int n) throws InterruptedException {
         Thread.sleep(3000);
        driver.findElement(By.xpath("(.//a[contains(@class, 'p-name js-product-name')])[" + n + "]")).click();
        return new ProductPage(driver);
    }

}
