package Bai6.bai6_2;

public class TestMain {
    static void main(String[] args) {
        Circle c1= new Circle(9);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());
        Rectangle r1= new Rectangle(10,8);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());
    }
}
