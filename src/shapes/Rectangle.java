package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    int getArea(){
        return length * width;
    }

    int getPerimeter(){
        return 2 * length + 2 * width;
    }

}// class