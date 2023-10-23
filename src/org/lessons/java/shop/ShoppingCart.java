package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Product product1 = new Product("pappa", "fsdofkjslf", new BigDecimal(29.99), new BigDecimal(22.00));


        System.out.println(product1.getCodeProduct());
        System.out.println(product1.getDescriptionProduct());
        System.out.println(product1.getNameProduct());
        System.out.println(product1.getPriceProduct());
        System.out.println(product1.getIvaProduct());
        System.out.println(product1.getFullPrice());



        userInput.close();
    }
}
