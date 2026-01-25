package Bai6.bai6_1;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(String blue, String aTrue, double width, double length){}

    public Rectangle(double width, double length) {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width*length);
    }

    @Override
    public String toString() {
        return "{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
