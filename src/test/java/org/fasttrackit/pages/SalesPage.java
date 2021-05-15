package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class SalesPage extends PageObject {

    @FindBy(css = "#nav ol li.level0.nav-5.parent a")
    private WebElementFacade saleLink;

    @FindBy(css = "body div div.page div.main-container.col3-layout div div.col-wrapper div.col-main div.category-products ul li div div.actions ul li:nth-child(1) a")
    private WebElementFacade addToWishlistLink;

    @FindBy(css = "body div div.page div.main-container.col2-left-layout div div.col-main div.my-account div.my-wishlist ul li ul li span")
    private WebElementFacade itemAddedText;

    @FindBy(css = "body div div.page div.main-container.col3-layout div div.col-wrapper div.col-main div.category-products ul li div div.actions a")
    private WebElementFacade viewDetailsLink;

    @FindBy(css = "#swatch27 > span.swatch-label > img")
    private WebElementFacade collorButton;

    @FindBy(css = "#swatch81 > span.swatch-label")
    private WebElementFacade sizeButton;

    @FindBy(css = "#product_addtocart_form div.product-shop div.product-options-bottom div.add-to-cart div.add-to-cart-buttons button")
    private WebElementFacade addToCartButton;

    @FindBy(css = "body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span")
    private WebElementFacade itemAddedToCartText;

    @FindBy(id = "qty")
    private WebElementFacade quantityInput;

    public void verifyAddToWishList(String message){
        clickOn(saleLink);
        clickOn(addToWishlistLink);
        Assert.assertTrue(itemAddedText.containsText(message));
    }

    public void verifyAddToCart(String message, int numberOfItems){
        clickOn(saleLink);
        clickOn(viewDetailsLink);
        clickOn(collorButton);
        clickOn(sizeButton);
        if(numberOfItems > 1){
            typeInto(quantityInput, String.valueOf(numberOfItems));
        }
        clickOn(addToCartButton);
        Assert.assertTrue(itemAddedToCartText.containsText(message));
    }

}
