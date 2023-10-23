package org.lessons.java.shop;

import java.math.BigDecimal;

public class ProductEarphone extends Product{
    // attributes
    private String colorEarphone;
    private boolean cabledEarphones;


    // constructor

    public ProductEarphone(String nameProduct, String descriptionProduct, BigDecimal priceProduct, BigDecimal ivaProduct, String colorEarphone, boolean cabledEarphones) {
        super(nameProduct, descriptionProduct, priceProduct, ivaProduct);
        this.colorEarphone = colorEarphone;
        this.cabledEarphones = cabledEarphones;
    }


    // methods

    @Override
    public String toString() {
        return super.toString() + ", Color: " + colorEarphone + ", Cabled: " + cabledEarphones;
    }
    public BigDecimal getDiscount(boolean arg) {
        BigDecimal discountValue = super.getDiscount(true);
        if (cabledEarphones){
            discountValue = new BigDecimal(7).multiply(new BigDecimal(100));
        }
        return discountValue;
    }
}
