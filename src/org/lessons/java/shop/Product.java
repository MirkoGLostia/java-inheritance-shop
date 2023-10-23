package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // attributes
    private int codeProduct;
    private String nameProduct;
    private String descriptionProduct;
    private BigDecimal priceProduct;
    private BigDecimal ivaProduct;



    // constructor
    public Product(String nameProduct, String descriptionProduct, BigDecimal priceProduct, BigDecimal ivaProduct) {
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.ivaProduct = ivaProduct;

        Random randomNumber = new Random();
        this.codeProduct = randomNumber.nextInt(1, 9999999);
    }




    // getter e setter

    // codeProduct
    public String getCodeProduct() {
        return String.format("%08d", this.codeProduct);
    }

    // nameProduct
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    // descriptionProduct
    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    // priceProduct
    public BigDecimal getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(BigDecimal priceProduct) {
        this.priceProduct = priceProduct;
    }

    // ivaProduct
    public BigDecimal getIvaProduct() {
        return ivaProduct;
    }

    public void setIvaProduct(BigDecimal ivaProduct) {
        this.ivaProduct = ivaProduct;
    }




    // methods

    public BigDecimal getFullPrice() {
        return priceProduct.add(priceProduct.multiply(ivaProduct.divide(new BigDecimal(100)))).setScale(2, RoundingMode.HALF_EVEN);
    }

}
