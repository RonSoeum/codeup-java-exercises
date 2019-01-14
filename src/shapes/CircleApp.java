package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        boolean consent = true;

        do{
            System.out.println("Create a new circle: enter the radius of a circle between 1 and 50.");
            Circle circle = new Circle(Input.getDouble(1, 50));
            circle.area = circle.getArea();
            circle.circumference = circle.getCircumference();

            circle.getCircleInfo();

            System.out.println("Do you want to make another circle?");
            consent = Input.yesNo();

        }while(consent);

        Circle.getTotalCirclesCreated();

    }// main

}// class
