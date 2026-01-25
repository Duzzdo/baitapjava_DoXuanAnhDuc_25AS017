package Bai4.b4_2;

public class TestMain {
    public static void main(String[] args) {
        Person p = new Person("An", "Da Nang");
        Student s = new Student("Binh", "Hue", "IT", 2, 1200);
        Staff st = new Staff("Cuong", "HCM", "VKU", 1500);

        System.out.println(p);
        System.out.println(s);
        System.out.println(st);
    }
}
