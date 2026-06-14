package ejercicio3_clase10;

import java.util.Scanner;

public class Ejercicio3_Clase10 {
public static void main(String[] args) {
    
    Scanner entrance = new Scanner(System.in);
    
    System.out.println("Enter your grade in Participation: ");
    double participation = entrance.nextDouble();
    
    System.out.println("Enter your grade in the first midterm: ");
    double firstMidterm = entrance.nextDouble();
    
    System.out.println("Enter your grade in the second midterm: ");
    double secondMidterm = entrance.nextDouble();
    
    System.out.println("Enter your final exam grade: ");
    double finalExam = entrance.nextDouble();
    
    double finalGrade = (participation * 0.10) + (firstMidterm * 0.25) + (secondMidterm * 0.25) + (finalExam * 0.40);
    
    System.out.println("Your final grade is: "+finalGrade);
    } 
}
