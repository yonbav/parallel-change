package com.pduda.field;

public class ImagineThisIsAClientInADifferentRepository {
    public String formattedTotalPrice(int shoppingCart) {
        return String.format("Total price is %d euro", new ShoppingCart(shoppingCart).calculateTotalPrice());
    }
}
