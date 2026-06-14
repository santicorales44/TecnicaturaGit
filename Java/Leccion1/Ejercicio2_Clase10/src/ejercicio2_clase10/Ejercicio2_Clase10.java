package ejercicio2_clase10;

import java.util.Scanner;

public class Ejercicio2_Clase10 {
public static void main(String[] args) {
    
    Scanner entrance = new Scanner(System.in);
    
    System.out.println("Enter the value for a: ");
    double a = entrance.nextDouble();
    System.out.println("Enter the value for b: ");
    double b = entrance.nextDouble();
    
    double result = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);
    System.out.println("The result to the formula(a+b)2=a2+b2+2*a*b using your values is: ");
    System.out.println(result);
    }   
}
