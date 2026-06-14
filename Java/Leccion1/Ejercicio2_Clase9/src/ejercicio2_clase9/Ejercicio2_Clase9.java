package ejercicio2_clase9;

import java.util.Scanner;

public class Ejercicio2_Clase9 {
public static void main(String[] args) {
    
    Scanner entrance = new Scanner (System.in);
    
    System.out.println("Enter the total to pay to know if you have a 20% discount: ");
    double purchase = entrance.nextDouble();
    
    double discount;
    
    if(purchase > 100){
        discount = purchase * 0.2;  
    }
    else{
        discount = 0;
    }
    double finalPrice = purchase - discount;
    System.out.println("The total payment is: "+finalPrice);
    } 
}