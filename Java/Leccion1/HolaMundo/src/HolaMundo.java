
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
        
        Scanner entrance = new Scanner (System.in);
        System.out.println("Enter the book's name: ");
        var bookName = entrance.nextLine();
        System.out.println("Enter the autor's name: ");
        var authorName = entrance.nextLine();
        System.out.println("The book "+bookName+" was written by " + authorName);
        */
        /*
        byte intNumberByte = 127;
        System.out.println("intNumberByte = " + intNumberByte);
        System.out.println("Byte's minimum value:" + Byte.MIN_VALUE);
        System.out.println("Byte's maximum value:" + Byte.MAX_VALUE);
        
        short intNumberShort = 32767;
        System.out.println("intNumberShort = " + intNumberShort);
        System.out.println("Short's minimum vale:" + Short.MIN_VALUE);
        System.out.println("Short's maximum vale:" + Short.MAX_VALUE);
        
        int intNumberInteger = 2147483647;
        System.out.println("intNumberInteger: " + intNumberInteger);
        System.out.println("Int minimum value: " + Integer.MIN_VALUE);
        System.out.println("Int maximum value: " + Integer.MAX_VALUE);
        
        long intNumberLong = 9223372036854775807L;
        System.out.println("intNumberLong = " + intNumberLong);
        System.out.println("Long minimum value: " + Long.MIN_VALUE);
        System.out.println("Long maximum value: " + Long.MAX_VALUE);
        */
        
        /*
        float floatNumber = 3.4028235E38F;
        System.out.println("floatNumber = " + floatNumber);
        System.out.println("Float's minimum value is:" + Float.MIN_VALUE);
        System.out.println("Float's maximum value is:" + Float.MAX_VALUE);
        
        double doubleNumber = 1.7976931348623157E308D;
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("Double's minimum value is:" + Double.MIN_VALUE);
        System.out.println("Double's maximum value is:" + Double.MAX_VALUE);
        */
        
        /*
        //Var and primitive types inference
        var intNumber = 20;  //Literals without . are automatically int type.
        System.out.println("intNumber = " + intNumber);
        var floatNumber = 10.0F; //With the decimal point it turns into a double
        System.out.println("floatNumber = " + floatNumber);
        var doubleNumber = 10.0;
        System.out.println("doubleNumber = " + doubleNumber);
        
        //Char primitive type
        char myVariableChar = 'a';
        System.out.println("myVariableChar = " + myVariableChar);
        
        char varCharacter = '\u0024'; //We indicate to Java the assignation with the value unicode
        System.out.println("varCharacter = " + varCharacter);
        char varDecimalCharacter = 36; //Decimal value of unicode characters
        System.out.println("varDecimalCharacter = " + varDecimalCharacter);
        char varSymbolCharacter = '$'; //One special character, we can copy paste from unicode
        System.out.println("varSymbolCharacter = " + varSymbolCharacter);
        
        var varCharacter1 = '\u0024'; //We indicate to Java the assignation with the value unicode
        System.out.println("varCharacter1 = " + varCharacter1);
        var varDecimalCharacter1 = (char)36; //Integer value and is asigned an int type
        System.out.println("varDecimalCharacter1 = " + varDecimalCharacter1);
        var varSymbolCharacter1 = '$'; //One special character, we can copy paste from unicode
        System.out.println("varSymbolCharacter1 = " + varSymbolCharacter1);
        
        int varIntegerChar = '$';
        System.out.println("varIntegerChar = " + varIntegerChar);
        int characterChar = 's';
        System.out.println("characterChar = " + characterChar);
        */
        
        /*
        //Boolean primitive types
        var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("The flag is green");
        }
        else{
            System.out.println("The flag is red");
        }
        
        //Algorithm: ¿Is the person of legal age?
        
        var age = 18; //Literal keep in mind the types inference
        //var adult = age >= 18; //This is a boolean expression
        if(age >= 18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
         }
        */
        
        /*
        //Primitive types convertion
        var age = Integer.parseInt("20");
        System.out.println("age = " + (age + 1));
        var valuePI = Double.parseDouble("3.1316");
        System.out.println("valuePI = " + valuePI);
        
        //Ask for a value
        var entrance = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = Integer.parseInt(entrance.nextLine());
        System.out.println("age = " + age);
        */
        
        /*
        //Primitive types convertion Part 2
        var textAge = String.valueOf(10);
        System.out.println("textAge = " + textAge);
        
        var charPhrase = "Coders".charAt(5);
        System.out.println("charPhrase = " + charPhrase);
        
        System.out.println("Enter a character: ");
        charPhrase = entrance.nextLine().charAt(0);
        System.out.println("charPhrase = " + charPhrase);
        */
        
        
    }
}