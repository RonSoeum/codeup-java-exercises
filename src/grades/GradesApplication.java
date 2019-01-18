package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static grades.Student.getGradeAverage;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
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

        System.out.println("Welcome!");
        System.out.println("\nHere are the github usernames of our students: ?\n");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.printf("|%s| ", entry.getKey());
        }

        do {

            System.out.println("\n\nWhat student would you like to see more info on?");

            String selected = userSelectStudent();
            String studentName = students.get(selected).getName();
            ArrayList<Integer> studentGrade = students.get(selected).getGrades();

            switch (selected) {
                case "ronGithub":
                    System.out.printf("Name: %s | Github Username: %s%n", studentName, selected);
                    System.out.printf("Current Average: %.2f%n%n", getGradeAverage(studentGrade));
                    break;
                case "justinGithub":
                    System.out.printf("Name: %s | Github Username: %s%n", studentName, selected);
                    System.out.printf("Current Average: %.2f%n%n", getGradeAverage(studentGrade));
                    break;
                case "ryanGithub":
                    System.out.printf("Name: %s | Github Username: %s%n", studentName, selected);
                    System.out.printf("Current Average: %.2f%n%n", getGradeAverage(studentGrade));
                    break;
                case "sarahGithub":
                    System.out.printf("Name: %s | Github Username: %s%n", studentName, selected);
                    System.out.printf("Current Average: %.2f%n%n", getGradeAverage(studentGrade));
                    break;
            }

        }while(input.yesNo("Would you like to see another student?"));

        System.out.println("Exiting application...");

    }// main

    static Input input = new Input();

    static String userSelectStudent(){
        String userSelectStudent = input.getString();

        if(userSelectStudent.equals("ronGithub")
                || userSelectStudent.equals("justinGithub")
                || userSelectStudent.equals("ryanGithub")
                || userSelectStudent.equals("sarahGithub")){

            return userSelectStudent;

        }else{
            System.out.println("No users with that username were found:");
            return userSelectStudent();
        }
    }// userSelectStudent

}// class