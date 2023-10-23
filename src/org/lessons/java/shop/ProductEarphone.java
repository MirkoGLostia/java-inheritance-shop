package org.lessons.java.shop;

import java.math.BigDecimal;

public class ProductEarphone extends Product{
    // attributes
    private String colorEarphone;
    private boolean wirelessEarphone;


    // constructor

    public ProductEarphone(String nameProduct, String descriptionProduct, BigDecimal priceProduct, BigDecimal ivaProduct, String colorEarphone, boolean wirelessEarphone) {
        super(nameProduct, descriptionProduct, priceProduct, ivaProduct);
        this.colorEarphone = colorEarphone;
        this.wirelessEarphone = wirelessEarphone;
    }
}
