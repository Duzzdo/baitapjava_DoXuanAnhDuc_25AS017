package Bai2.b2_9;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());

        MyTriangle t2 = new MyTriangle(
                new MyPoint(0, 0),
                new MyPoint(2, 0),
                new MyPoint(1, (int)Math.sqrt(3)) // gần đều
        );
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());
    }
}
