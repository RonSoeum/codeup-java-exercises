package util;

public class InputTest {

    public static void main(String[] args) {

        // dataType variableName = new ClassName();
        Input input = new Input();
//
//        if (input.yesNo("Do you want to enter a number?")) {
//            int favoriteNumber = input.getInt("What is your favorite number?");
//            System.out.println("You said " + favoriteNumber);
//        }
//
//        if (input.yesNo("Do you want to exit the application?")) {
//            System.exit(0);
//        }
//
//        String name = input.getString("What is your name?");
//        System.out.println("Hello, " + name + "!");


//        if(input.yesNo("Do you like stargazing?")){
//            System.out.println("I love stargazing too. It is a very cool thing to do.");
//        }else{
//            System.out.println("Maybe you should try it sometime, stargazing gives you a sense of cosmic scale");
//        }
//
//        if(input.yesNo("Do you have a pet?")){
//            if(input.yesNo("Is it a pet dog?")){
//                System.out.println("That's awesome, I like dogs.");
//            }else{
//                String pet = input.getString("What type of pet do you have?");
//                System.out.printf("%s are great pets too.%n", pet);
//            }
//        }else{
//            System.out.println("That's OK, pets aren't for everyone.");
//        }
//
//        int age = input.getInt("How old are you?");
//        if(age < 35){
//            System.out.println("You are still young.");
//        }else if(age > 35){
//            System.out.println("You are older than dirt.");
//        }else if(age == 35){
//            System.out.println("We are the same age.");
//        }
//
//        double gpa = input.getDouble(0.0, 4.0,"What is your GPA");
//        if(gpa < 3.50){
//            System.out.printf("%.2f is horrible.", gpa);
//        }else{
//            System.out.println("WoW, you're so smart!");
//        }


        // Codeup Java Exceptions and Error Handling
//        System.out.println(input.getInt("enter int"));
//        System.out.println(input.getDouble("enter double"));

        // Bonus
            // getBinary
                System.out.println(input.getBinary("enter binary"));
//
//                String binaryString = Integer.toBinaryString(7);
//                System.out.println(binaryString);

            // getHex
                System.out.println(input.getHex("enter hexidecimal"));

    }//main

}// class