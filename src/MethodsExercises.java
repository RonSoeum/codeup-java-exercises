import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

//        addition(10, 2);
//        subtraction(3,40);
//        multiplication(25,6);
//        division(81,4);
//        modulus(200, 8040);
//        multiplyWOSymbol(25, 5);
//        multiplyWOSymbolPlusRecursion(2, 6);

//        getInteger(1,10);

        factorial(1, 10);
//
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
        return  result;
    }

    public static int multiplication(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
        return  result;
    }

    public static double division(double num1, double num2){
        double result = num1 / num2;
        System.out.println(result);
        return  result;
    }

    public static int modulus(int num1, int num2){
        int result = num1 % num2;
        System.out.println(result);
        return  result;
    }

//    Bonus
//
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static long multiplyWOSymbol(long a, long b){
        if(a == 0 || b == 0){
            System.out.println(0);
            return 0;
        }

        if(b >= 1) {
            do {
                a += a;
                b--;
            } while (b >= 1);
        }else{
            do {
                a += a;
                b++;
            } while (b <= -1);
        }

        System.out.println(a);
        return a;
    }

//    Do the above with recursion.

    public static long multiplyWOSymbolPlusRecursion(long a, long b){
        if(a == 0 || b == 0){
            System.out.println(0);
            return 0;
        }

        if(a == 1){
            System.out.println(b);
            return b;
        }
        if(b == 1){
            return a;
        }

        if(b > 1) {
            a += a;
            b--;
            return multiplyWOSymbolPlusRecursion(a, b);
        }

        if(b < -1) {
            a += a;
            b++;
            return multiplyWOSymbolPlusRecursion(a, b);
        }
        System.out.println("a: " + a);
        return 0;
    }

//    2.User input is in a certain range

    public static void getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int userInput = scanner.nextInt();
        if(userInput >= min & userInput <= max){
            System.out.printf("Your number %d is within the range.%n", userInput);
        }else{
            getInteger(min, max);
        }
    }

//    3.Calculate the factorial of a number.

    public static void factorial(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int userInput = scanner.nextInt();
        if(userInput >= min & userInput <= max){
            System.out.printf("Your number %d is within the range.%nHere is the factorial of your number.%n", userInput);
            int fact = 1;
            for(int i = 1; i <= userInput; i++){
                fact = fact * i;
                System.out.println(fact);
            }
        }else{
            factorial(min, max);
        }
    }

//    4.Create an application that simulates dice rolling.

    public static void dice() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.println("Do you want to roll the dice?");
        String rollDice = scanner.next();
        if (rollDice.equalsIgnoreCase("yes") || rollDice.equalsIgnoreCase("y")) {
            System.out.println("Enter the number of sides for a pair of dice.");
            int diceSides = scanner.nextInt(), dice1, dice2;
            do {
                dice1 = random.nextInt(diceSides);
                dice2 = random.nextInt(diceSides);
                System.out.printf("Dice 1 rolled for: %d%nDice 2 rolled for: %d%n%n", dice1, dice2);
                System.out.println("Do you want to roll the dice again?");
                rollDice = scanner.next();
            } while (rollDice.equalsIgnoreCase("yes") || rollDice.equalsIgnoreCase("y"));
        }else if(rollDice.equalsIgnoreCase("no") || rollDice.equalsIgnoreCase("n")) {
            System.out.println("Ok, you don't want to roll.");
        }else{
            dice();
        }
    }

//    Other Methods

    public static int getInt(int num){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        return num;
    }

}//class
