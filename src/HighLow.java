import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int i, limit;

        System.out.println("Welcome to the High-Low guessing game!");

        for(i = 1, limit = 10; i <= limit; i++){

            int randomNum = random.nextInt(99)+1;
            boolean askUser = true, range = true;

            while(range) {
                System.out.println("Guess a number between 1 and 100.");
                int userInput = getIntOneToOneHundred();

                if (userInput < randomNum && userInput >= 1 && userInput <= 100) {
                    System.out.printf("Higher! The random number is %d.%n%n", randomNum);
                    range = false;
                } else if (userInput > randomNum && userInput >= 1 && userInput <= 100) {
                    System.out.printf("Lower! The random number is %d.%n%n", randomNum);
                    range = false;
                } else if (userInput == randomNum) {
                    System.out.printf("Good Guess! The random number is %d.%n%n", randomNum);
                    range = false;
                } else {
                    range = true;
                }
            }

            if(i == limit){
                askUser = false;
                System.out.printf("You have reached the limit.%nGame Over");
            }else{
                System.out.printf("You have made a total of %d guess(es).%nYou have %d guess left.%n%n", i, limit - i);
            }

            while(askUser){
                System.out.println("Do you want to guess again?");
                String continueGame = scanner.next();
                if(continueGame.equalsIgnoreCase("yes")
                        || continueGame.equalsIgnoreCase("y")) {
                    askUser = false;
                } else if (continueGame.equalsIgnoreCase("no")
                        || continueGame.equalsIgnoreCase("n")) {
                    i = limit;
                    askUser = false;
                    System.out.println("Game Over");
                } else {
                    System.out.println("You did not enter yes or no.");
                    askUser = true;
                }
            }//while loop

        }//for loop

    }//main

    public static int getIntOneToOneHundred(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        while(!scan.hasNextInt()) { //repeat until a number is entered.
            scan.next();
            System.out.println("You did not enter a number between 1 and 100."); //Tell it's not a number.
        }
        return scan.nextInt(); //Get your number here
    }

}//class
