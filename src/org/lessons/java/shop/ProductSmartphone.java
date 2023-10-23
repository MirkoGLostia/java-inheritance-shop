package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class ProductSmartphone extends Product {
    // attributes
    private int codeIMEI;
    private int memoryCapacity;




    // constructor

    public ProductSmartphone(String nameProduct, String descriptionProduct, BigDecimal priceProduct, BigDecimal ivaProduct, int memoryCapacity) {
        super(nameProduct, descriptionProduct, priceProduct, ivaProduct);
        this.memoryCapacity = memoryCapacity;

        Random randomNumber = new Random();
        this.codeIMEI = randomNumber.nextInt(1, 9999999);
    }


    // methods
}
