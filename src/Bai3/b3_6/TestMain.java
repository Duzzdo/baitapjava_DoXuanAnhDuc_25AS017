package Bai3.b3_6;

public class TestMain {
    public static void main(String[] args) {
        Ball b = new Ball(50,50,5,10,45);
        Container c = new Container(0,0,100,100);
        b.move();
        if(c.collides(b)) b.reflectHorizontal();
        System.out.println(b);
    }
}
