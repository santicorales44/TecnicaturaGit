package ejercicio1_clase10;

import java.util.Scanner;

public class Ejercicio1_Clase10 {
public static void main(String[] args) {
   
    Scanner entrance = new Scanner(System.in);
    
    System.out.println("Enter a number of hours to calculate the weeks, days and hours: ");
    int totalHours = entrance.nextInt();
    
    int weeks = totalHours / 168;
    
    int spareHours = totalHours % 168;
    
    int days = spareHours / 24;
    
    int finalHours = spareHours % 24;
    
    System.out.println(totalHours+" hours equals to:");
    System.out.println(weeks+" weeks");
    System.out.println(days+" days");
    System.out.println(finalHours+" hours");
    }
}