package com.shop.internal;

import com.shop.core.Product;

public class PriceEngine {

    public static double calculateDiscountedPrice(Product p, double discountPercent) {
        return p.price * (1 - discountPercent / 100);
    }
}