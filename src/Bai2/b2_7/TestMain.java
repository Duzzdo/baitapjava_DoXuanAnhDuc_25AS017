package Bai2.b2_7;

public class TestMain {
    public static void main(String[] args) {
        MyLine line = new MyLine(0, 0, 3, 4);
        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient(rad): " + line.getGradient());

        line.setBeginXY(10, 10);
        line.setEndXY(13, 14);
        System.out.println("After set: " + line);
        System.out.println("Length: " + line.getLength());
    }
}
