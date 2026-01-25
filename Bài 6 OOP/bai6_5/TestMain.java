package bai6_5;

public class TestMain {
    static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());
        ResizableCircle rc1 = new ResizableCircle(12);
        System.out.println(rc1.radius);
        System.out.println(rc1.getArea());
        System.out.println(rc1.getPerimeter());
        System.out.println(rc1.toString());
    }
}
