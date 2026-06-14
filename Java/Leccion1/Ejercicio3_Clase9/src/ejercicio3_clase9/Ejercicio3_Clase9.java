package ejercicio3_clase9;

import java.util.Scanner;

public class Ejercicio3_Clase9 {
public static void main(String[] args) {
    
    Scanner entrance = new Scanner(System.in);
    
    System.out.println("Enter two numbers: ");
    
    double number1 = entrance.nextDouble();
    double number2 = entrance.nextDouble();
    double result;
    
    if(number1 == number2){
        result = (number1 * number2);
    }
    else if (number1 > number2){
        result = (number1 - number2);
    }    
    else{
        result = (number1 + number2);  
    }
    System.out.println("The result is: "+result);
    } 
}
