package Bai2.b2_8;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(3, 4, 5);

        System.out.println(c1);
        System.out.println("Area c1: " + c1.getArea());

        System.out.println(c2);
        System.out.println("Circumference c2: " + c2.getCircumference());

        System.out.println("Distance centers: " + c1.distance(c2));
    }
}
