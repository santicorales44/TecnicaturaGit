
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
 /*
        int num1 = 5, num2 = 4;
        var solution = num1 + num2;
        System.out.println("addition solution = " + solution);
        
        solution = num1 - num2;
        System.out.println("substraction solution = " + solution);

        solution = num1 * num2;
        System.out.println("multiplication solution = " + solution);
        
        solution = num1 / num2;
        System.out.println("division solution = " + solution);
        
        var solution2 = 3.4 / num2;
        System.out.println("division solution = " + solution2);
        
        solution = num1 % num2; // It saves the integer rest of the division
        System.out.println("solution = " + solution); // 5/4
        
        // IMPORTANT: If using an if/else with only one line, it's not necessary
        // to use {}. It's an exception.
        if (num1 % 2 == 0)
            System.out.println("It's an even number");
            else
            System.out.println("It's an odd number");   
         */
 /*
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; // An operation
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; // this is the same as: varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -= 1;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 *= 3;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 /= 3;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 %= 2;
        System.out.println("varNum1 = " + varNum1);
         */
 /*
        // Unary Operators: Sign change
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); // The result will be a negative number
        
        // Negation operator
        var varC = true; //For default, this literal in Java is a boolean type
        var varD = !varC; // Here it changes the value
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        // Increase Unary Operators: 
        //Pre-Increase
        var varE = 9; // It's value will change
        var varF = ++varE; // Symbol before the value
        // First it increments the variable and then uses it's value
        System.out.println("varE = " + varE); // It increases in the unity
        System.out.println("varF = " + varF); // It will add one
        
        // Post-Increase (The symbol is used after the variable.
        var varG = 3;
        var varH = varG++; //First the variable value and then the increment
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        // Decrease Unary Operators:
        // Pre-Decrease
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//The variable is decreased
        System.out.println("varJ = " + varJ);
        
        //Post-Decrease
        var varK = 8;
        var varL = varK--; // First the variable value, then the decrease is left
        System.out.println("varK = " + varK); // Here it will decrease in 1
        System.out.println("varL = " + varL);
         */
 /*
        // Equality and Relational Operators
        
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var chainA = "Hello";
        var chainB = "Bye";
        var cVar = chainA == chainB;
        System.out.println("cVar = " + cVar);

        var fVar = chainA.equals(chainB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum; // > >= < <= == !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        var age = 30;
        var adult = 18;
        if(age>=adult){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
        }
         */
 
        /*
        // Conditional operators: 
        // and (&&)
        // or (
        var valueA = 7;
        var minimumValue = 0; // Range between 0 and 10
        var maximumValue = 10;
        var answer = valueA >= 0 && valueA <= 10;

        if (answer) {
            System.out.println("It's in the established range.");
        } else {
            System.out.println("It's out of the established range.");
        }

        var holidays = true;
        var freeDay = false;
        if (holidays || freeDay) {
            System.out.println("Dad can attend the game with his son.");
        } else {
            System.out.println("Dad can't attend the game with his son.");
        }
        */
        
        /*
        // Ternary Operator
        
        var resultT = (5>8)? "True" : "False";
        System.out.println("resultT = " + resultT);
        
        var numberT = 7;
        resultT = (numberT % 2 == 0) ? "It's even" : "It's odd";
        System.out.println("resultT = " + resultT);
        */
        
        /*
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var arithmeticSolution = 4 + 5 * 6 / 3;
        System.out.println("arithmeticSolution = " + arithmeticSolution);
        
        arithmeticSolution = (4 + 5) * 6/3;
        System.out.println("arithmeticSolution = " + arithmeticSolution);
        */
        
        /*
          Scanner entrance = new Scanner (System.in);
          System.out.println("Enter the rectangle's base: ");
          double base = entrance.nextDouble();
          System.out.println("Enter the rectangle's height");
          double height = entrance.nextDouble();
        
        double area = base * height;
        double perimeter = 2 * (base + height);
        
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("The perimeter of the rectangle is: "+ perimeter);
        */
        
        int numberA = 5;
        int numberB = 3;
        String result = (numberA>numberB) ? "Number A is the biggest one" : "Number B is the biggest one";
        System.out.println("result = " + result);
    }
}