package Bai2.b2_6;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Distance p2 to (0,0): " + p2.distance());
        System.out.println("Distance p2 to (10,10): " + p2.distance(10, 10));
        System.out.println("Distance p2 to p1: " + p2.distance(p1));
    }
}
