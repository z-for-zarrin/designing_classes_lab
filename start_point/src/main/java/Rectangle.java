public class Rectangle {
//    class attributes
    private int width;
    private int length;

//    constructor function
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calculateArea() {
        return this.length * this.width;
    }

    public boolean isSquare() {
        return this.length == this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
