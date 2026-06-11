// BOOK SHOP
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Enter the book's name: ");
        String bookName = entrance.nextLine();
        System.out.println("Enter the book's ID: ");
        int bookID = Integer.parseInt(entrance.nextLine());
        System.out.println("Enter the book´s price: ");
        double bookPrice = Double.parseDouble(entrance.nextLine());
        System.out.println("Confirm or deny free shipping: ");
        boolean freeShipping = Boolean.parseBoolean(entrance.nextLine());
        System.out.println("The book's name is: "+bookName);
        System.out.println("The book's ID is: "+bookID);
        System.out.println("The book's price is: "+bookPrice);
        System.out.println("The book's free shipping is: "+freeShipping);
    }
}