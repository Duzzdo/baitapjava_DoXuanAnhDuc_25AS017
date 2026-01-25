package Bai5.bai5_1;

public class Main {
    static void main(String[] args) {
        Point p1 = new Point(2,4);
        System.out.println(p1);
        p1.setX(5);
        System.out.println(p1);
        p1.setXY(6,5);
        System.out.println(p1);
        Line l1= new Line(4,6,8,10);
        System.out.println(l1);
        Point p2= new Point(6,10);
        Line l2= new Line(p1,p2);
        System.out.println(l2);
        System.out.println(l2.getLength());
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
        System.out.println(l2.getGradient());
    }
}

