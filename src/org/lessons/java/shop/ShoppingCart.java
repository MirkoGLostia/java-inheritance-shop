package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // variables
        int typeOfProduct = 0;
        boolean exitCode = false;
        boolean errorCodeTypeProduct = false;
        String name;
        String description;
        BigDecimal price;
        BigDecimal iva;

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

            } else if (typeOfProduct == 2) {
                // smartphone
            } else if (typeOfProduct == 3) {
                // earphones
            }else {
                System.out.println("invalid input");
                errorCodeTypeProduct = true;
            }
        }while (!exitCode);



        userInput.close();
    }
}
