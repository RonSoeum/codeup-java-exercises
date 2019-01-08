import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        JAVA I: Console IO

//        1. Copy this code into your main method:
            double pi = 3.14159;

//        Write some java code that uses the variable pi to output the following:
            System.out.format("The value of pi is approximately %.2f.%n", pi);

//        Explore the Scanner Class

//            1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
                Scanner scanner = new Scanner(System.in).useDelimiter("\n");

                System.out.println("Enter an interger: ");
//                int inoutInteger1 = scanner.nextInt();
                int inputInteger2 = Integer.parseInt(scanner.nextLine());
                System.out.println("You entered: " + inputInteger2);

//                * What happens if you input something that is not an integer?
//                    Error

//            2. Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
                System.out.println("Enter 3 words: ");
                String word1 = scanner.next();
                String word2 = scanner.next();
                String word3 = scanner.next();
                System.out.println("You entered: " + word1);
                System.out.println("You entered: " + word2);
                System.out.println("You entered: " + word3);

//                What happens if you enter less than 3 words?
//                    It waits for a third input.
//                What happens if you enter more than 3 words?
//                    It does not print the fourth word.

//            3. Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
//                System.out.println("Enter a sentence: ");
//                String sentence1 = scanner.next();
//                System.out.print("You entered a sentence: " + sentence1);

//                do you capture all of the words?
//                    No

//            4. Rewrite the above example using the .nextLine method.
                System.out.println("Enter a sentence: ");
                String sentence2 = scanner.next();
                System.out.println("You entered a sentence: " + sentence2);

//        Calculate the perimeter and area of Codeup's classrooms

//            1. Prompt the user to enter values of length and width of a classroom at Codeup.
                System.out.println("Enter the length and width of the classroom: ");

//                Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//                    String width = scanner.nextLine();
//                    String length = scanner.nextLine();
//                    int width = (int) width;
//                    int width = (int) length;
                    int width = Integer.parseInt(scanner.next());
                    int length = scanner.nextInt();

//                * Assume that the rooms are perfect rectangles.
//                * Assume that the user will enter valid numeric data for length and width.

//            2. Display the area and perimeter of that classroom.
                System.out.println("Classroom perimeter: " + width + " x " + length);

//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
                System.out.println("Classroom Area: " + length*width);
//
//                Bonuses
//
//        Accept decimal entries
//        Calculate the volume of the rooms in addition to the area and perimeter


    }

}
