public class HelloWorld {
    public static void main(String[] args) {
//        Java I: Introduction To Java

//        3. Hello World
        System.out.println("Hello, World!");
        System.out.print("Hello,");
        System.out.print(" World!\n");

//        Java I: Syntax, Types, and Variables

//        1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 1;
        System.out.println(myFavoriteNumber);

//        2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "string value";
        System.out.println(myString);

//        3. Change your code to assign a character value to myString. What do you notice?
//        String myString = 'C';
//        System.out.println(myString);

//        4. Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159;
//        System.out.println(myString);

//        5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);

//        6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//        System.out.println(myNumber);

//        7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber);

//        8. Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println(myNumber);

//        9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//        float myNumber = 3.14F;
        double myNumber = 3.14;
        System.out.println(myNumber);

//        10. Copy and paste the following code blocks one at a time and execute them.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        11. Try to create a variable named class. What happens?
//        String class;

//        12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//        int three = (int) "three";
//        System.out.println(three);

//        13. Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        y -= (x/y);
//        System.out.println(y);

//        14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        byte byteNum = -200;
//        short shortNum = -50000;
        byte byteIncrement = 127;
        System.out.println(++byteIncrement);

    }
}
