package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        Circle circle1 = new Circle(input.getDouble(1, 50, "Create a new circle: enter the radius of a circle between 1 and 50."));
        circle1.area = circle1.getArea();
        circle1.circumference = circle1.getCircumference();
        circle1.getCircleInfo();

        while(input.yesNo("Do you want to make another circle?")){
            Circle circle = new Circle(input.getDouble(25, 75, "Create a new circle: enter the radius of a circle between 25 and 75."));
            circle.area = circle.getArea();
            circle.circumference = circle.getCircumference();
            circle1.getCircleInfo();
        }

        Circle.getTotalCirclesCreated();

    }// main

}// class