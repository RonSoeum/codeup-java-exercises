import java.util.*;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        addition(10, 2);
        subtraction(3,40);
        multiplication(25,6);
        division(80,4);
        modulus(400, 8040);

//        getInteger(1,10);

        factorial(1, 10);

        dice();

    }//main

//    1.Basic Arithmetic

    public static int addition(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static int subtraction(int num1, int num2){
        int result = num1 - num2;
        System.out.println(result);
        return  num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
        return  num1 * num2;
    }

    public static int division(int num1, int num2){
        int result = num1 / num2;
        System.out.println(result);
        return  num1 / num2;
    }

    public static int modulus(int num1, int num2){
        int result = num1 % num2;
        System.out.println(result);
        return  num1 / num2;
    }

//    2.User input is in a certain range

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if(userInput >= min & userInput <= max){
            System.out.printf("Your number %d is within the range.%n", userInput);
        }else{
            System.out.println("Enter a number between 1 and 10: ");
            userInput = scanner.nextInt();
            getInteger(1, 10);
        }
        return userInput;
    }

//    3.Calculate the factorial of a number.

    public static void factorial(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if(userInput >= min & userInput <= max){
            System.out.printf("Your number %d is within the range.%nHere is the factorial of your number.%n", userInput);
            int fact = 1;
            for(int i = 1; i <= userInput; i++){
                fact = fact * i;
                System.out.println(fact);
            }
        }else{
            System.out.println("Enter a number between 1 and 10: ");
            userInput = scanner.nextInt();
            factorial(1, 10);
        }
    }

//    4.Create an application that simulates dice rolling.

    public static void dice() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.println("Enter the number of sides for a pair of dice.");
        int diceSides = scanner.nextInt();
        System.out.println("Test your luck and Roll the dice: (yes/no)");
        String rollDice = scanner.next();
        if (rollDice.equalsIgnoreCase("yes") || rollDice.equalsIgnoreCase("y")) {
            int dice1, dice2;
            do {
                dice1 = random.nextInt(diceSides);
                dice2 = random.nextInt(diceSides);
                System.out.printf("Dice 1 rolled for: %d%nDice 2 rolled for: %d%n%n", dice1, dice2);
                System.out.println("Do you want to roll the dice again?");
                rollDice = scanner.next();
            } while (rollDice.equalsIgnoreCase("yes") || rollDice.equalsIgnoreCase("y"));
        }
    }

}//class
