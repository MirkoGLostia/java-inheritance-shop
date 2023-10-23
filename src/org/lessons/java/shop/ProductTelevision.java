package org.lessons.java.shop;

import java.math.BigDecimal;

public class ProductTelevision extends Product{
    // attributes
    private int dimensionTelevision;
    private boolean smartTelevision;


    // constructor

    public ProductTelevision(String nameProduct, String descriptionProduct, BigDecimal priceProduct, BigDecimal ivaProduct, int dimensionTelevision, boolean smartTelevision) {
        super(nameProduct, descriptionProduct, priceProduct, ivaProduct);
        this.dimensionTelevision = dimensionTelevision;
        this.smartTelevision = smartTelevision;
    }

    // methods


    @Override
    public String toString() {
        return super.toString() + ", Dimension: " + dimensionTelevision + ", Smart: " + smartTelevision;
    }
    public BigDecimal getDiscount(boolean arg) {
        BigDecimal discountValue = super.getDiscount(true);
        if (!smartTelevision){
            discountValue = new BigDecimal(10).multiply(new BigDecimal(100));
        }
        return discountValue;
    }
}
