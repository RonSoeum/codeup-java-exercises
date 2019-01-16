package shapes;

public class Square extends Rectangle {

    Square(int side) {
        super(side, side);
    }

    @Override
    protected int getArea() {
        return (int) Math.pow(length, 2);
    }

    @Override
    protected int getPerimeter() {
        return 4 * length;
    }

}// class