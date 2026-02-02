package com.sho;

import com.shop.core.Product;
import com.shop.internal.PriceEngine;

public class ShopApplication {

    public static double calculate(Product p, double discountPercent) {
        return PriceEngine.calculateDiscountedPrice(p, discountPercent);
    }
}