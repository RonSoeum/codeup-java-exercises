package shapes;

// 4.Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
abstract class Quadrilateral extends Shape implements Measurable {

    // protected properties for length and width
    protected int length;
    protected int width;

    // a constructor that accepts two numbers for the length and width and sets those properties
    Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // methods for getting the length and width
    int getLength() {
        return length;
    }

    int getWidth() {
        return width;
    }

    // abstract methods for setting the length and width
    abstract void setLength(int length);

    abstract void setWidth(int width);

}// class