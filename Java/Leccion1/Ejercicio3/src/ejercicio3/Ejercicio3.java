package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {

    Scanner entrance = new Scanner (System.in);
          System.out.println("Enter the rectangle's base: ");
          double base = entrance.nextDouble();
          System.out.println("Enter the rectangle's height");
          double height = entrance.nextDouble();
        
        double area = base * height;
        double perimeter = 2 * (base + height);
        
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("The perimeter of the rectangle is: "+ perimeter);
    }
}