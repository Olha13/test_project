package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Actions {

     WebDriver driver = new FirefoxDriver();

    public Actions(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForSeconds (int n){
            driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);
        }

    public void waitForElementPrecents (String Locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator);
    }


    public  void goBack(){
        driver.navigate().back();
    }

    public  void goForward(){

        driver.navigate().forward();
    }

    public  void reFresh() {
        driver.navigate().refresh();
    }
}
