package condicionalejercicio1;

import java.util.Scanner;

public class CondicionalEjercicio1 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Enter a number of a month of the year: ");
        var month = Integer.parseInt(entrance.nextLine());
        var station = "Unwnokn station";
        if(month == 1 || month == 2 || month == 3){
           station = "Summer";
        }
        else if(month == 4 || month == 5 || month == 6){
            station = "Fall";
        }
        else if(month == 7 || month == 8 || month == 9){
            station = "Winter";
        }
        else if(month == 10 || month == 11 || month == 12){
            station = "Spring";
            
        }
        else{
            System.out.println("Error. You MUST enter a number between 1 and 12");
        }
        System.out.println("The month "+month+" is on "+station);
    }
}
