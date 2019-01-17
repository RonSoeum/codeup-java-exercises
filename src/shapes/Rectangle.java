package shapes;

// 5.Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable{

    // 1.Remove the code from the body of your Rectangle and Square classes.

    // constructor
    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override// implement Quadrilateral
    void setLength(int length) {
        this.length = length;
    }

    @Override// implement Quadrilateral
    void setWidth(int width) {
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