package Bai6.bai6_1;

public class Square extends Rectangle{
    public Square(){
        super(1.0,1.0);
    }
    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(double side){
        return getWidth();
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Square" +
                super.toString()
                ;
    }
}
