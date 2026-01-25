package Bai4.b4_5;

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

