package shapes;

// 5.Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable{

    // 1.Remove the code from the body of your Rectangle and Square classes.

    // constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override// implement Quadrilateral
    public void setLength(double length) {
        this.length = length;
    }

    @Override// implement Quadrilateral
    public void setWidth(double width) {
        this.width = width;
    }

    @Override// implement Measurable
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override// implement Measurable
    public double getArea() {
        return length * width;
    }

}// class