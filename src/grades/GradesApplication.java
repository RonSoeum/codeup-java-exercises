package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student ron = new Student("ron");
        Student justin = new Student("justin");
        Student ryan = new Student("ryan");
        Student sarah = new Student("sarah");
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

        System.out.println(students.get("ronGithub").getName());

    }// main

}// class