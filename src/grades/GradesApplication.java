package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();

        students.put("johnGithub", new Student("john"));                                        // class example
        students.get("johnGithub").addGrade(100);
        students.get("johnGithub").addGrade(90);
        students.get("johnGithub").addGrade(80);
        System.out.printf("Class Example - John Grade Avg: %.2f%n", students.get("johnGithub").getGradeAverage());    // class example

        Student ron = new Student("Ron");
        Student justin = new Student("Justin");
        Student ryan = new Student("Ryan");
        Student sarah = new Student("Sarah");
        ron.addGrade(78);
        ron.addGrade(88);
        ron.addGrade(98);
        justin.addGrade(76);
        justin.addGrade(66);
        justin.addGrade(56);
        ryan.addGrade(99);
        ryan.addGrade(89);
        ryan.addGrade(79);
        sarah.addGrade(56);
        sarah.addGrade(65);
        sarah.addGrade(75);
        students.put("ronGithub", ron);
        students.put("justinGithub", justin);
        students.put("ryanGithub", ryan);
        students.put("sarahGithub", sarah);

        String username = "";                       // class example
        for(String user: students.keySet()){
            username += "|" + user + "| ";
        }
        System.out.println("Class Example - " + username + "\n\n\n");               // class example

        System.out.println("Welcome!");
        System.out.println("\nHere are the github usernames of our students:\n");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.printf("|%s| ", entry.getKey());
        }
        System.out.println("\n");

        do {
            String selected = input.getString("What student would you like to see more info on?");

            while(!students.containsKey(selected)){
                selected = input.getString("No users with that username were found:");
            }

            String studentName = students.get(selected).getName();
            double studentGrade = students.get(selected).getGradeAverage();

            if(students.containsKey(selected)){
                System.out.printf("Name: %s | Github Username: %s%n", studentName, selected);
                System.out.printf("Current Average: %.2f%n%n", studentGrade);
            }
        }while(input.yesNo("Would you like to see another student?"));

        System.out.println("Exiting application...");

    }// main

}// class