package Bai3.b3_2;

public class TestMain {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.1, 4.05);
        MyComplex c2 = new MyComplex(1.2, 2.3);
        System.out.println(c1);
        System.out.println("Magnitude: " + c1.magnitude());
        System.out.println("Add new: " + c1.addNew(c2));
        c1.addInto(c2);
        System.out.println("After addInto: " + c1);
    }
}
