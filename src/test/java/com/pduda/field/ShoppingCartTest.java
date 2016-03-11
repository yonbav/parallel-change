package com.pduda.field;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart(10);

        Assert.assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    public void singleItem_totalPrice() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart(10);

        Assert.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void singleItem_hasDiscountIfContainsAProductWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart(100);

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void singleItem_doesNotHaveDiscountIfContainsAProductWorthLessThan100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart(99);

        Assert.assertFalse(shoppingCart.hasDiscount());
    }

}
