package Bai4.b4_5;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(double width, double length,
                     String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width + ",length=" + length + "]";
    }
}
