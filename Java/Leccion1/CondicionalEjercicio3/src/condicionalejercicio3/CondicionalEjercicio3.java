package condicionalejercicio3;

import java.util.Scanner;

public class CondicionalEjercicio3 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 10: ");
        var grade = Integer.parseInt(entrance.nextLine());
        if(grade >= 9 && grade <= 10){
            System.out.println("A");
        }
        else if(grade >= 8 && grade < 9){
            System.out.println("B");
        }
        else if(grade >= 7 && grade < 8){
            System.out.println("C");
        }    
        else if(grade >= 6 && grade < 7){
            System.out.println("D");
        }
        else if(grade >= 0 && grade < 6){
            System.out.println("F");
        }
        else{
            System.out.println("Out of range");
        }
    }
}