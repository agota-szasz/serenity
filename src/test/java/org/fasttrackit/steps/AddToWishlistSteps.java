package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.SalesPage;

public class AddToWishlistSteps {

    private SalesPage salesPage;

    @Step
    public void verifyAddToWishlist(){
        salesPage.verifyAddToWishList("Slim fit Dobby Oxford Shirt has been added to your wishlist.");
    }

}
