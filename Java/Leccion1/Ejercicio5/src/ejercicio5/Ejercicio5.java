package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
    
    Scanner entrance = new Scanner (System.in);
    
    System.out.println("Enter the first grade: ");
    double grade1 = entrance.nextDouble();
    
    System.out.println("Enter the second grade: ");
    double grade2 = entrance.nextDouble();
    
    System.out.println("Enter the third grade: ");
    double grade3 = entrance.nextDouble();

    double gradesAddition = (grade1 + grade2 + grade3);
    System.out.println("The addition of the 3 grades is: "+gradesAddition);
    }
}