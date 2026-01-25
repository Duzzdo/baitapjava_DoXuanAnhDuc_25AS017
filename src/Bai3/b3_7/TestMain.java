package Bai3.b3_7;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(10,10,0);
        Player p = new Player(7,12,12);
        System.out.println(p.near(ball));
        p.kick(ball);
    }
}
