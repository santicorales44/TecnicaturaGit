package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) { 
    
    Scanner entrance = new Scanner (System.in);
    
    System.out.println("Enter the amount of dollars Guillermo has: ");
    double dollarsGuille = entrance.nextDouble();
    
    double dollarsLuis = (dollarsGuille / 2);
    System.out.println("Luis has half of the total dollars Guillermo has: "+dollarsLuis);
    
    double dollarsJuan = (dollarsGuille + dollarsLuis) / 2;
    System.out.println("Juan has half of the total Guillermo and Luis has: "+dollarsJuan);
    
    double totalDollars = (dollarsGuille + dollarsLuis + dollarsJuan);
    System.out.println("The amount of dollars they have together is: "+totalDollars);
    }
}
