package com.pduda.field;

import java.util.ArrayList;
import java.util.Collection;

public class ShoppingCart {
    private final Collection<Product> products = new ArrayList<>();

    public void add(int price) {
        this.products.add(new Product(price));
    }

    public int calculateTotalPrice() {
        return this.products.stream().map(Product::getPrice).reduce(0, Integer::sum);
    }

    public boolean hasDiscount() {
        return products.stream().anyMatch(product -> product.getPrice() >= 100);
    }

    public int numberOfProducts() {
        return products.size();
    }
}
