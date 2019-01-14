package shapes;

public class Circle {

    private static int totalCirclesCreated;
    private double radius;
    public double area;
    public double circumference;

    // constructor
    public Circle(double radius){
        this.radius = radius;
        totalCirclesCreated++;
    }

    // get total number of circles created
    public static void getTotalCirclesCreated(){
        System.out.printf("You made %d circle(s)!%n", totalCirclesCreated);
    }

    // get circle info
    public void getCircleInfo(){
        System.out.printf("Radius: %.2f%n", this.radius);
        System.out.printf("Area: %.2f%n", this.area);
        System.out.printf("Circumference: %.2f%n", this.circumference);
    }

    public double getArea(){
//        System.out.printf("Area: %.2f%n", area);
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
//        System.out.printf("Circumference: %.2f%n", circumference);
        return 2 * Math.PI * radius;
    }

}// class
