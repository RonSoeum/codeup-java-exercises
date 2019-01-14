package util;
import java.util.Scanner;

public class Input {

    private static String getString(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        return scan.next();
    }

    public static boolean yesNo(){
//        System.out.println("Do you want to continue?");
        String input = getString();
        if(input.equalsIgnoreCase("yes")
                || input.equalsIgnoreCase("y")
                || input.equalsIgnoreCase("no")
                || input.equalsIgnoreCase("n")){
            if(input.equalsIgnoreCase("yes")
                    || input.equalsIgnoreCase("y")){
//                System.out.println("true");
                return true;
            }else{
//                System.out.println("false");
                return false;
            }
        }else{
            System.out.println("Enter \"yes\" or \"no\" :");
            return yesNo();
        }
    }

    //==============================================================================

    private static int getInt(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        return scanner.nextInt();
    }

    public static int getInt(int min, int max){
        System.out.printf("Enter an integer number between %d and %d:%n", min, max);
        int input = getInt();
        if(input >= min & input <= max){
            System.out.printf("Your number %d is within the range.%n", input);
            return input;
        }else{
            return getInt(min, max);
        }
    }

    //==============================================================================

    private static double getDouble(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        return scanner.nextDouble();
    }

    public static double getDouble(double min, double max){
//        System.out.printf("Enter a decimal number between %.2f and %.2f:%n", min, max);
        double input = getDouble();
        if(input >= min & input <= max){
//            System.out.printf("Your number %.2f is within the range.%n", input);
            return input;
        }else{
            System.out.println("Your input is outside the range.");
            return getDouble(min, max);
        }
    }

}//class
