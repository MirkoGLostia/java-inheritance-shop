package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // variables
        Product[] listOfProducts = {};
        int typeOfProduct = 0;
        boolean exitCode = false;
        boolean errorCodeTypeProduct = false;
        String moreProducts = "";
        String name = "";
        String description = "";
        BigDecimal price = new BigDecimal(0);
        BigDecimal iva = new BigDecimal(0);

        System.out.println("Welcome!!");

        do {
            System.out.println("what product are you inserting?");
            if (!errorCodeTypeProduct){
                System.out.print("name of product: ");
                name = userInput.nextLine();
                System.out.print("description of product: ");
                description = userInput.nextLine();
                System.out.print("how much does it costs? ");
                price = new BigDecimal(userInput.nextLine());
                System.out.print("what is the taxation rate? ");
                iva = new BigDecimal(userInput.nextLine());
            }
            System.out.println("1 for television");
            System.out.println("2 for smartphone");
            System.out.println("3 for earphones");
            typeOfProduct = Integer.parseInt(userInput.nextLine());
            if (typeOfProduct == 1){
                // televisions
                System.out.println("what is the dimension?");
                int dimension = Integer.parseInt(userInput.nextLine());
                System.out.println("is it a smart television (true/false)?");
                boolean smart = Boolean.parseBoolean(userInput.nextLine());

                // construction
                ProductTelevision product = new ProductTelevision(name, description, price, iva, dimension, smart);

                // add to array
                Product[] newArray = new Product[listOfProducts.length + 1 ];
                for (int i = 0; i < listOfProducts.length; i++) {
                    newArray[i] = listOfProducts[i];
                }
                newArray[listOfProducts.length] = product;
                listOfProducts = newArray;
            } else if (typeOfProduct == 2) {
                // smartphone
                System.out.println("how big is the memory?");
                int memory = Integer.parseInt(userInput.nextLine());

                //construction
                ProductSmartphone product = new ProductSmartphone(name, description, price, iva, memory);

                // add to array
                Product[] newArray = new Product[listOfProducts.length + 1 ];
                for (int i = 0; i < listOfProducts.length; i++) {
                    newArray[i] = listOfProducts[i];
                }
                newArray[listOfProducts.length] = product;
                listOfProducts = newArray;
            } else if (typeOfProduct == 3) {
                // earphones
                System.out.println("what is the color?");
                String color = userInput.nextLine();
                System.out.println("is it cabled (true/false)?");
                boolean cable = Boolean.parseBoolean(userInput.nextLine());

                //construction
                ProductEarphone product = new ProductEarphone(name, description, price, iva, color, cable);


                // add to array
                Product[] newArray = new Product[listOfProducts.length + 1 ];
                for (int i = 0; i < listOfProducts.length; i++) {
                    newArray[i] = listOfProducts[i];
                }
                newArray[listOfProducts.length] = product;
                listOfProducts = newArray;
            }else {
                System.out.println("invalid input");
                errorCodeTypeProduct = true;
            }


            System.out.println("Do you have more products to add? (y/n)");
            moreProducts = userInput.nextLine();

            if (moreProducts.equals("n")) {
                exitCode = true;
            }
        }while (!exitCode);

        System.out.println("thi is the list of products you inserted");
        for (int i = 0; i < listOfProducts.length; i++) {
            System.out.println(listOfProducts[i]);
        }


        userInput.close();
    }
}
