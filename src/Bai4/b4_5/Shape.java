package Bai4.b4_5;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}

