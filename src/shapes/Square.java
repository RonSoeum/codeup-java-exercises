package shapes;

public class Square extends Rectangle {

    protected int side;

    Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    protected int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    protected int getPerimeter() {
        return 4 * side;
    }

}// class