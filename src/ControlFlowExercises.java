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

    //        Your output should look like this:
    //
    //        5 6 7 8 9 10 11 12 13 14 15

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
//                for(int fizz = 1; fizz <= 100; fizz++){
//                    System.out.println("fizz 1 to 100: " + fizz);
//                }

//            For multiples of three print “Fizz” instead of the number
//                for(int fizz = 1; fizz <= 100; fizz++){
//                    if(fizz % 3 == 0){
//                        System.out.println("Fizz");
//                    }else{
//                        System.out.println(fizz);
//                    }
//                }

//            For the multiples of five print “Buzz”.
//                for(int fizz = 1; fizz <= 100; fizz++){
//                    if(fizz % 3 == 0){
//                        System.out.println("Fizz");
//                    }else if(fizz % 5 == 0){
//                        System.out.println("Buzz");
//                    }else{
//                        System.out.println(fizz);
//                    }
//                }

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




    }

}
