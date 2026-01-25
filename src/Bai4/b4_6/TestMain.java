package Bai4.b4_6;

public class TestMain {
    public static void main(String[] args) {
        Cat c = new Cat("Kitty");
        Dog d1 = new Dog("Lucky");
        Dog d2 = new Dog("Max");

        System.out.println(c);
        c.greets();

        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}
