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
        System.out.println("average grade : " + ron.getGradeAverage());

    }// main

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(double element: grades){
            total += element;
        }
        return total / grades.size();
    }

}// class