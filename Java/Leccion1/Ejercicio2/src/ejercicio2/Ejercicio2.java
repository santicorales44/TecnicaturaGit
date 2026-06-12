package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {
    
public static void main(String[] args) {
    Scanner entrance = new Scanner (System.in);
    System.out.println("Enter how many hours do you work in a week: ");
    int hours = entrance.nextInt();
    System.out.println("Enter your payment per hour: ");
    double payment = entrance.nextDouble();

    double weeklySalary = (hours * payment);
    System.out.println("Your salary in a week is: "+weeklySalary+"$");
    
    double monthlySalary = (weeklySalary * 4);
    System.out.println("Your actual salary (in a month) is: "+monthlySalary+"$");
    }
}