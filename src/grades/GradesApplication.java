package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();

        students.put("ronGithub", new Student("Ron"));
        students.put("justinGithub", new Student("justin"));
        students.put("ryanGithub", new Student("ryan"));
        students.put("sarahGithub", new Student("sarah"));
        students.put("johnGithub", new Student("john"));
        students.get("ronGithub").addGrade(78);
        students.get("ronGithub").addGrade(88);
        students.get("ronGithub").addGrade(98);
        students.get("justinGithub").addGrade(76);
        students.get("justinGithub").addGrade(66);
        students.get("justinGithub").addGrade(56);
        students.get("ryanGithub").addGrade(99);
        students.get("ryanGithub").addGrade(89);
        students.get("ryanGithub").addGrade(79);
        students.get("sarahGithub").addGrade(56);
        students.get("sarahGithub").addGrade(65);
        students.get("sarahGithub").addGrade(75);
        students.get("johnGithub").addGrade(100);
        students.get("johnGithub").addGrade(90);
        students.get("johnGithub").addGrade(80);

        System.out.println("\nWelcome!");
        System.out.println("\nHere are the github usernames of our students:\n");

        String username = "";
        for(String user: students.keySet()){
            username += "|" + user + "| ";
        }
        System.out.println(username + "\n");

//        for (Map.Entry<String, Student> entry : students.entrySet()) {    // alternative code
//            System.out.printf("|%s| ", entry.getKey());
//        }
//        System.out.println("\n");

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