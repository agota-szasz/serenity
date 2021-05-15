package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.SalesPage;

public class AddToCartSteps {

    private SalesPage salesPage;

    @Step
    public void verifyAddToCartSingleItem(){
        salesPage.verifyAddToCart("Slim fit Dobby Oxford Shirt was added to your shopping cart", 1);
    }

    public void verifyAddToCartThreeItemsSameProduct() {
        salesPage.verifyAddToCart("Slim fit Dobby Oxford Shirt was added to your shopping cart", 3);
    }
}
