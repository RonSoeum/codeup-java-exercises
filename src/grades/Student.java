package grades;
import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {

        Student ron = new Student("Ron");

        System.out.println("name: " + ron.getName());

        ron.addGrade(89);
        ron.addGrade(65);
        ron.addGrade(73);
        ron.addGrade(97);
        ron.addGrade(55);

        System.out.println("grades : " + ron.grades);

        System.out.println("average grade : " + getGradeAverage(ron.grades));


    }// main

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public static double getGradeAverage(ArrayList<Integer> array){
        double a = 0;
        for(double b: array){
            a += b;
        }
        return a / array.size();
    }

}// class
