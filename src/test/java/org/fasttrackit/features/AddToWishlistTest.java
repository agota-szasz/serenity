package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToWishlistSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class AddToWishlistTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private AddToWishlistSteps addToWishlistSteps;


    @Test
    public void addToWishlist(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        addToWishlistSteps.verifyAddToWishlist();
    }

}
