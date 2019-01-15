import java.util.Random;
import java.util.Scanner;

public class MethodBonus {

    public static void main(String[] args) {
//        firstChar("TH ESD FKJS DF");
//        secondChar("AD KSJF HSDG VNOWE");
//        lastChar("AS OID FNAS DKJVN");
//        secondToLastChar("ALK DFJOI SD UGVBN");
//        userWantsToContinue();
//        isEven(12343451);
//        isOdd(122456521);
//        countOdds(15, 51);
//        countEvens(45, 99);
//        isVowel("I");
//        hasVowels("AB EF IJ OP UV");
//        countVowels("AE IO UMNBVCX");
//        fizzBuzzRecursive(100, 200);
//        isPrime(2);//2,3,5,7,11,13,17,19,23,29
//        getTwentyPrimes();
//        coinFlip();
//        randomWalk(33);
//        countOnes("1010100101");
//        countZeros("001110011");



    }//main

    public static String getString() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        return scan.next();
    }

    public static String getStringYesNo() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String output= scan.next();
        if(output.equalsIgnoreCase("yes")
            || output.equalsIgnoreCase("y")
            || output.equalsIgnoreCase("no")
            || output.equalsIgnoreCase("n")){
            return output;
        }else{
            System.out.println("Enter \"yes\" or \"no\" :");
            return getStringYesNo();
        }
    }

    public static int randomFiftyFifty(){
        Random random = new Random();
        return random.nextInt(2);
    }

    public static char firstChar(String input){
        if (input == "" || input == null) {
            return ' ';
        }
        char firstChar = input.charAt(0);
        System.out.println(firstChar);
        return firstChar;
    }

    public static char secondChar(String input){
        if (input == "" || input == null) {
            return ' ';
        }
        char firstChar = input.charAt(1);
        System.out.println(firstChar);
        return firstChar;
    }

    public static char lastChar(String input) {
        if (input == "" || input == null) {
            return ' ';
        }
        char lastChar = input.charAt(input.length() - 1);
        System.out.println(lastChar);
        return lastChar;
    }

    public static char secondToLastChar(String input) {
        if (input == "" || input == null) {
            System.out.println("Invalid String");
            return ' ';
        }
        if (input.length() >= 2) {// if word is at least two characters long
            char secondToLastChar = input.charAt(input.length() - 2);// access the second from last character
            System.out.println(secondToLastChar);
            return secondToLastChar;
        }else{
            System.out.println("Invalid String");
            return ' ';
        }
    }

    public static boolean userWantsToContinue() {
        System.out.println("Do you want to continue?");
        String userInput = getStringYesNo();
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }

    public static boolean isOdd(int num){
        if(num % 2 != 0){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    public static int countOdds(int start, int end){
        int oddNumbers = 0;
        for(; start <= end; start++){
            if(start % 2 == 1){
                oddNumbers++;
            }
        }
        System.out.println(oddNumbers);
        return oddNumbers;
    }

    public static int countEvens(int start, int end){
        int evenNumbers = 0;
        for(; start <= end; start++){
            if(start % 2 == 0){
                evenNumbers++;
            }
        }
        System.out.println(evenNumbers);
        return evenNumbers;
    }

    public static boolean isVowel(String input){
        if(input.length() == 1
            && input.equalsIgnoreCase("a")
            || input.equalsIgnoreCase("e")
            || input.equalsIgnoreCase("i")
            || input.equalsIgnoreCase("o")
            || input.equalsIgnoreCase("u")){
//            System.out.println("Input is a vowel.");
            return true;
        }else if(input.length() > 1){
//            System.out.println("String input is more than 1 length.");
            return false;
        }else{
//            System.out.println("Input is not a vowel.");
            return false;
        }
    }

    public static void hasVowels(String input){
        input.chars().forEach(i -> isVowel(Character.toString(i)));
    }

    public static int countVowels(String input){
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if(isVowel(Character.toString(input.charAt(i)))){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
        return vowelCount;
    }

    public static void fizzBuzzRecursive(int start, int end){
        if(start % 3 == 0 && start % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(start % 3 == 0){
            System.out.println("Fizz");
        }else if(start % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(start);
        }
        start++;
        if(start <= end){
            fizzBuzzRecursive(start, end);
        }
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        if(num < 2){
            isPrime = false;
        }
        if(isPrime){
            System.out.printf("%d is a Prime Number%n", num);
            return isPrime;
        }else{
//            System.out.printf("%d is not a Prime Number", num);
            return isPrime;
        }
    }

    public static void getTwentyPrimes(){
        for(int i = 1; i <= 20 ;i++){
            isPrime(i);
        }
    }

    public static boolean coinFlip(){
        if(randomFiftyFifty() == 0){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    public static String randomWalk(int num){
        String result = "";
        String oneZero;
        for(int i = 1; i <= num; i++){
            if(randomFiftyFifty() == 0){
                oneZero = "0";
            }else{
                oneZero =  "1";
            }
            result = result + oneZero;
        }
        System.out.println(result);
        return result;
    }

    public static int countOnes(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int countZeros(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}//class
