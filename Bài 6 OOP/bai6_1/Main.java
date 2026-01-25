package bai6_1;
public class Main {
    static void main(String[] args) {
        Shape s1 = new Circle("red", false, 5.4);
        System.out.println(s1.filled);
        System.out.println(s1.color);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());
        Shape s2 = new Rectangle("blue" ,true ,4.6,6.9);
        System.out.println(s1.color);
        System.out.println(s1.filled);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s2.toString());
        Shape s3= new Square("yellow",true,10);
        System.out.println(s3.color);
        System.out.println(s3.filled);
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getArea());
        System.out.println(s3.toString());;
    }
}
