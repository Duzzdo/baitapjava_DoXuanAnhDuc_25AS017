package Bai3.b3_4;

public class TestMain {
    public static void main(String[] args) {
        MyTime t = new MyTime(23, 59, 58);
        System.out.println(t.nextSecond());
        System.out.println(t.nextSecond());
        System.out.println(t.previousSecond());
    }
}
