package com.ciklum.myProject;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;


public class testClass_1 extends BaseClass {


    @Test
    public void testCheckPriceOnCatalogAndCard() throws InterruptedException {
        LoggedInPage log = new LoggedInPage(driver);
        LeboutiqueSearchPage search = log.logInToAmazon("rwn95874@dsiay.com", "123456789");
        Thread.sleep(3000);
        CatalogPage catalog = search.findProduct("Часы");
        Thread.sleep(3000);
        ProductPage product = catalog.klickOnProduct(6);
        Thread.sleep(3000);
        double productCoast= product.getProductPrice();
        product.clickOnAddToCard();
        Thread.sleep(300);
        CardPage card = product.goToCardPage();
        double productCoastInCard = card.getSubtotalValue();
        Assert.assertEquals(productCoastInCard, productCoast);
    }

}
