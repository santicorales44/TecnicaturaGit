package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {

    Scanner entrance = new Scanner (System.in);
    
    final double BASE_SALARY = 1000;
    final double CAR_COMMISSION = 150;
    
    System.out.println("Enter how many cars you sold this month: ");
    int soldCars = entrance.nextInt();
    double totalCommission = (CAR_COMMISSION * soldCars);
    
    System.out.println("Enter how much these cars cost IN TOTAL: ");
    double carsCost = entrance.nextDouble();
    double carsFivePercent = (carsCost * 0.05);
    
    double salary = (BASE_SALARY + totalCommission + carsFivePercent);
    System.out.println("Your salary is: "+salary);
    }
}
