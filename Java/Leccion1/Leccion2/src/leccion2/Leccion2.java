package leccion2;

import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
        /*var condition = true;
        if(condition){
            System.out.println("True Condition"); // Simple conditional
        }else{
            System.out.println("False Condition");
        }
        
        var number = 3;
        var textNumber = "Unknown number";
        if (number == 1){
            textNumber = "Number one";
        }
        else if (number == 2){
            textNumber = "Number two";
        }
        else if (number == 3){
            textNumber = "Number three";
        }
        else if (number == 4){
            textNumber = "Number four";
        }
        else{
            textNumber = "Number not found";
        }
        System.out.println("text number = " + textNumber);*/
        
        Scanner entrance = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 4: ");
        var number = Integer.parseInt(entrance.nextLine());
        
        var textNumber = "Unknown value";
        switch(number){
            case 1:
                textNumber = "Number one";
                break;
            case 2:
                textNumber = "Number two";
                break;
            case 3:
                textNumber = "Number three";
                break;
            case 4:
                textNumber = "Number four";
                break;
            default:
                textNumber = "Case not found";
        }
        System.out.println("textNumber = " + textNumber);
    }
}
