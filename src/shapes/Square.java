package shapes;

// 6.Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral {

    // 1.Remove the code from the body of your Rectangle and Square classes.

    public Square(int side) {
        super(side, side);
    }

    // Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
    @Override// implement Quadrilateral
    void setLength(int side) {
        this.length = side;
        this.width = side;
    }

    @Override// implement Quadrilateral
    void setWidth(int side) {
        this.length = side;
        this.width = side;
    }

    @Override// implement Measurable
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override// implement Measurable
    public double getArea() {
        return length * width;
    }

}// class