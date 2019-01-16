package shapes;

public class Square extends Rectangle {

    protected int side;

    Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    int getPerimeter() {
        return 4 * side;
    }
}// class