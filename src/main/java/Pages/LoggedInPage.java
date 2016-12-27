package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by opop on 12/12/2016.
 */
public class LoggedInPage  {

    private WebDriver driver;

    public LoggedInPage (WebDriver driver){

        this.driver = driver;
    }

    By signInLocator = By.xpath(".//*[@id='auth-menu']/a[1]");
    By emailLocator = By.xpath(".//*[@id='login-form']//input[@class ='js-email-value']");
    By passwordLocator = By.xpath(".//*[@id='login-form']//input[@class='js-password-value']");
    By okLocator = By.cssSelector(".btn.btn-48.s-yellow.js-submit");





    public LeboutiqueSearchPage logInToAmazon(String strMail, String strPasword) throws InterruptedException {
        Thread.sleep(3);
        driver.findElement(signInLocator).click();
        driver.findElement(emailLocator).sendKeys(strMail);
        driver.findElement(passwordLocator).sendKeys(strPasword);
        driver.findElement(okLocator).click();

    return new LeboutiqueSearchPage((FirefoxDriver) driver);
    }



}
