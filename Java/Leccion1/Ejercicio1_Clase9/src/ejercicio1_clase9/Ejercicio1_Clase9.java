package ejercicio1_clase9;

import java.util.Scanner;

public class Ejercicio1_Clase9 {
public static void main(String[] args) {

    Scanner entrance = new Scanner(System.in);
    
    System.out.println("Enter your 3 grades: ");
    double grade1 = entrance.nextDouble();
    double grade2 = entrance.nextDouble();
    double grade3 = entrance.nextDouble();
    
    double average = (grade1 + grade2 + grade3) / 3;
    if(average >= 70){
        System.out.println("You have passed with: "+average+"%");
    }
    else{
        System.out.println("You have failed with: "+average+"%");
    }
  }
}

