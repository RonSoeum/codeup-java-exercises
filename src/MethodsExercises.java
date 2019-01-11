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
//        multiplyWOSymbol(10, -32);
//        System.out.println(multiplyWOSymbolPlusRecursion(23, -5));

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

//    1.Bonus
//
//    Create your multiplication method without the * operator.

    public static long multiplyWOSymbol(long a, long b){
        long product = 0;

        if(a == 0 || b == 0){
            System.out.println(0);
            return 0;
        }

        if(b > 1) {
            do {
                product += a;
                b--;
            } while (b >= 1);
        }else{
            do {
                product -= a;
                b++;
            } while (b <= -1);
        }

        System.out.println(product);
        return product;
    }

//    Do the above with recursion.

    public static long multiplyWOSymbolPlusRecursion(long a, long b){
        if(a == 0 || b == 0) {
            return 0;
        }

        if(b > 0) {
            b--;
            return a + multiplyWOSymbolPlusRecursion(a, b);
        } else {
            System.out.println(a);
            return -multiplyWOSymbolPlusRecursion(a, -b);
        }
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
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int userInput = getIntRange(min, max);
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
//        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.println("Do you want to roll the dice?");
        String rollDice = getString();
        if (rollDice.equalsIgnoreCase("yes")
            || rollDice.equalsIgnoreCase("y")) {
            System.out.println("Enter the number of sides for a pair of dice.");
            int diceSides = getInt(), dice1, dice2;
            do {
                dice1 = random.nextInt(diceSides);
                dice2 = random.nextInt(diceSides);
                System.out.printf("Dice 1 rolled for: %d%nDice 2 rolled for: %d%n%n", dice1, dice2);
                System.out.println("Do you want to roll the dice again?");
                rollDice = getString();
                if(rollDice.equalsIgnoreCase("no")
                    || rollDice.equalsIgnoreCase("n")){
                    System.out.println("Ok, you don't want to roll.");
                }
            } while (rollDice.equalsIgnoreCase("yes")
                    || rollDice.equalsIgnoreCase("y"));
        }else if(rollDice.equalsIgnoreCase("no")
                || rollDice.equalsIgnoreCase("n")) {
            System.out.println("Ok, you don't want to roll.");
        }else{
            dice();
        }
    }

//    Other Methods

    public static int getInt(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        while(!scan.hasNextInt()) { //repeat until a number is entered.
            scan.next();
            System.out.println("You did not enter an integer."); //Tell it's not a number.
        }
        return scan.nextInt(); //Get your number here
    }

    public static int getIntRange(int min, int max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        while(!scan.hasNextInt()) { //repeat until a number is entered.
            scan.next();
            System.out.printf("Enter an integer between %d and %d:%n", min, max); //Tell it's not a number.
        }
        return scan.nextInt(); //Get your number here
    }

    public static String getString(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        return scan.next();
    }

}//class
