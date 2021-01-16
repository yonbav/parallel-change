package com.pduda.field;

import org.junit.Assert;
import org.junit.Test;

public class ImagineThisIsAClientInADifferentRepositoryTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() {
        ImagineThisIsAClientInADifferentRepository client = new ImagineThisIsAClientInADifferentRepository();

        Assert.assertEquals("Total price is 50 euro", client.formattedTotalPrice(50));
    }

}
