import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        String sure = "Sure.";
        String whoa = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String what = "Whatever";
        String userInput;
        boolean endBob = false;

        do{
            System.out.println("Talk to Bob:");
            userInput = scanner.next();

            if(userInput.equalsIgnoreCase("run")) {
                System.out.println("You ran away from Bob.");
                endBob = (userInput.equalsIgnoreCase("run"));
            } else if (userInput.endsWith("?")) {
                System.out.println(sure);
            } else if (userInput.endsWith("!")) {
                System.out.println(whoa);
            } else if (userInput.equals("")) {
                System.out.println(fine);
            } else {
                System.out.println(what);
            }
        }while(!endBob);

    }
}
