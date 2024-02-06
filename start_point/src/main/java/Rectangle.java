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

//    public boolean isSquare() {
//        return this.length == this.width;
//    }
}
