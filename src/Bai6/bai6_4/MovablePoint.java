package Bai6.bai6_4;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int xSpeed, int y, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "'(" +
                "x" +
                ", y)" +
                " Speed= (" + xSpeed +
                "," + ySpeed +
                ")'";

    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x-= xSpeed;
    }

    @Override
    public void moveRight() {
        x+= xSpeed;
    }
}
