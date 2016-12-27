package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeboutiqueSearchPage {

    private WebDriver driver;

    public LeboutiqueSearchPage(WebDriver driver){
        this.driver = driver;
    }

    By searchFieldLocator = By.id("js-widget-search-input");
    By searchButtonLocator = By.cssSelector(".result-link.all");

    public CatalogPage findProduct(String product) throws InterruptedException {
        driver.findElement(searchFieldLocator).sendKeys(product);

        driver.findElement(searchButtonLocator).click();

        return new CatalogPage(driver);
    }
}
