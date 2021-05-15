package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private AddToCartSteps addToCartSteps;

    @Test
    public void addToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        addToCartSteps.verifyAddToCartSingleItem();
    }

    @Test
    public void addMultipleItemsToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        addToCartSteps.verifyAddToCartThreeItemsSameProduct();
    }
}
