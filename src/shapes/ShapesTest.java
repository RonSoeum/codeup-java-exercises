package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        // ========== Previous Exercise ==========
//        // create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle(4, 5);
//
//
//        // verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//
//        // create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        Rectangle box2 = new Square(5);
//
//
//        // verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());



     // 7.Modify your ShapesTest class, use it to:

        // declare a variable of the type Measurable named myShape.
        Measurable myShape1;
        Measurable myShape2;

        // Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and circumference.
        myShape1 = new Square(41);
        System.out.println("Step 7 square area test: " + myShape1.getArea());
        System.out.println("Step 7 square perimeter test: " + myShape1.getPerimeter() + "\n");

        myShape2 = new Rectangle(34,45);
        System.out.println("Step 7 rectangle area test: " + myShape2.getArea());
        System.out.println("Step 7 rectangle perimeter test: " + myShape2.getPerimeter() + "\n");

        // 8.Answer the following questions:

        // 9.Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // Error:(4, 8) java: shapes.Rectangle is not abstract and does not override abstract method getPerimeter() in shapes.Measurable

        // 10.What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        System.out.println("Step 10 Square Test:\ngetLength - "
                + ((Quadrilateral) myShape1).getLength() + "\ngetWidth - "
                + ((Quadrilateral) myShape1).getWidth() + "\n");
        System.out.println("Step 10 Rectangle Test:\ngetLength - "
                + ((Quadrilateral) myShape2).getLength() + "\ngetWidth - "
                + ((Quadrilateral) myShape2).getWidth());
        // It returns the length and width.

    }// main

}// class