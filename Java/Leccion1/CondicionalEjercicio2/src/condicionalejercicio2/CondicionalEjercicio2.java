package condicionalejercicio2;

import java.util.Scanner;

public class CondicionalEjercicio2 {
public static void main(String[] args) {

    Scanner entrance = new Scanner (System.in);
    
    System.out.println("Enter a number of a month of the year: ");
    int month = entrance.nextInt();
    String station = "Unknown station";
    switch(month){
        case 1: case 2: case 3:
            station = "Summer";
            break;
        case 4: case 5: case  6:
            station = "Fall";
            break;
        case 7: case 8: case 9:
            station = "Winter";
            break;
        case 10: case 11: case 12:
            station = "Spring";
            break;
    }
    System.out.println("The month "+month+" is on "+station);
    }
}