import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){

//        1.Loop Basics
//
    //        a.While

    //        Create an integer variable i with a value of 5.
                int i = 5;

    //        Create a while loop that runs so long as i is less than or equal to 15
    //        Each loop iteration, output the current value of i, then increment i by one.
                while(i <= 15){
                    System.out.print(i + " ");
                    i++;
                }
                System.out.format("%n");

    //        b.Do While

    //        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
                int countbyTwo = 0;
                do{
                    System.out.println(countbyTwo);
                    countbyTwo += 2;
                }while(countbyTwo <= 100);

    //        Alter your loop to count backwards by 5's from 100 to -10.
                int backwardsByFive = 100;
                do{
                    System.out.println(backwardsByFive);
                    backwardsByFive -= 5;
                }while(backwardsByFive >= -10);

    //        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
                long numberSquared = 2;
                do{
                    System.out.println(numberSquared);
                    numberSquared *= numberSquared;
                }while(numberSquared < 1000000);

    //        c.For

    //        refactor the previous two exercises to use a for loop instead
    //            1.a
                    for(int ii = 5; ii <= 15; ii++){
                        System.out.print(ii + " ");
                    }
                    System.out.format("%n");

    //            1.b
                    for(int countbyTwoo = 0; countbyTwoo <= 100; countbyTwoo += 2){
                        System.out.println(countbyTwoo + " ");
                    }

                    for(int backwardsByFivee = 100; backwardsByFivee >= -10; backwardsByFivee -= 5){
                        System.out.println(backwardsByFivee);
                    }

                    for(long numberSquaredd = 2; numberSquaredd < 1000000; numberSquaredd *= numberSquaredd){
                        System.out.println(numberSquaredd);
                    }

//        2.Fizzbuzz

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.

//            Write a program that prints the numbers from 1 to 100.
//            For multiples of three print “Fizz” instead of the number.
//            For the multiples of five print “Buzz”.
//            For numbers which are multiples of both three and five print “FizzBuzz”.
                for(int fizz = 1; fizz <= 100; fizz++){
                    if(fizz % 3 == 0 && fizz % 5 == 0){
                        System.out.println("FizzBuzz");
                    }else if(fizz % 3 == 0){
                        System.out.println("Fizz");
                    }else if(fizz % 5 == 0){
                        System.out.println("Buzz");
                    }else{
                        System.out.println(fizz);
                    }
                }

//        3.Display a table of powers.
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");

//            Prompt the user to enter an integer.
//            Display a table of squares and cubes from 1 to the value entered.
//            Ask if the user wants to continue.
//            Assume that the user will enter valid data.
//            Only continue if the user agrees to.
                String userConfirm;
                do{
                    System.out.println("Enter an integer for a table with powers of 2 and 3.");
                    int intInput = scanner.nextInt();

                    System.out.println("number | squared | cubed");
                    System.out.println("------ | ------- | -----");

                    for(int sqCu = 1; sqCu <= intInput; sqCu++){
                        System.out.printf ("%d        %d        %d%n", sqCu, (sqCu * sqCu), (sqCu * sqCu * sqCu));
                    }

                    System.out.println("Do you want to continue the loop?");
                    userConfirm = scanner.next();

                }while(userConfirm.equalsIgnoreCase("yes") || userConfirm.equalsIgnoreCase("y"));

//        4.Convert given number grades into letter grades.

//            Prompt the user for a numerical grade from 0 to 100.
//            Display the corresponding letter grade.
//            Prompt the user to continue.
//            Assume that the user will enter valid integers for the grades.
//            The application should only continue if the user agrees to.
//            Grade Ranges:
//
//                A : 100 - 88
//                B : 87 - 80
//                C : 79 - 67
//                D : 66 - 60
//                F : 59 - 0

                System.out.println("Enter a numerical grade from 0 to 100.");
                int numericGrade = scanner.nextInt();
                String letterGrade;
                if(numericGrade >= 88) {
                    letterGrade = "A";
                } else if(numericGrade >= 80) {
                    letterGrade = "B";
                } else if(numericGrade >= 67) {
                    letterGrade = "C";
                } else if(numericGrade >= 60) {
                    letterGrade = "D";
                } else {
                    letterGrade = "F";
                }
                System.out.println("Grade is a " + letterGrade);

    }

}
