
import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {
        /*
       System.out.println("Hi world from Java");
       int myVariable = 10;
       System.out.println(myVariable);
       myVariable = 5;
       System.out.println(myVariable);
       //String Type
       String myVariableChain = "Welcome";
       System.out.println(myVariableChain);
       myVariableChain = "Let's keep growing in coding";
       System.out.println(myVariableChain);
         
        
       // - Java types inference
       var myIntVariable2 = 10;
       var myVariableChain2 = "We keep studying";
       System.out.println("myIntVariable2 = " + myIntVariable2);
       System.out.println("myVariableChain2 = " + myVariableChain2);
       // soutv + tab
       // To run: Shift + F6
       /* Rules to define a variable in Java:
       1- You CAN use any letter you want from a to z as the first character
       2- You CAN NOT use a number as the first character
       3- You CAN NOT use a special character as the first character (?¡!"#)
       4- You CAN use "_" and "$" as the first character but it's not common
       5- You CAN use accent but it's not reccomended.
 
        var user = "Oscar";
        var title = "Engineer";
        var union = title + " " + user;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(user + (a + b));
        
        //Exercise: special characters with Java
        var name = "Natalia";
        System.out.println("New line: \n" + name);
        System.out.println("Tab: \t" + name);
        System.out.println("\t.:Menu:.");
        System.out.println("Setback: \b"+name);
        System.out.println("Single quotes: \'"+name+"\'");
        System.out.println("Double quotes: \""+name+"\"");
        
       //Scanner Class in Java
       Scanner entrance = new Scanner (System.in);
        System.out.println("Enter your name: ");
       var user2 = entrance.nextLine();
        System.out.println("user2 = " + user2);
        System.out.println("Write the title: ");
        var title2 = entrance.nextLine();
        System.out.println("Result: "+title2+" "+user2);
        */
        Scanner entrance = new Scanner (System.in);
        System.out.println("Enter the book's name: ");
        var bookName = entrance.nextLine();
        System.out.println("Enter the autor's name: ");
        var authorName = entrance.nextLine();
        System.out.println("The book "+bookName+" was written by " + authorName);
    }
}
