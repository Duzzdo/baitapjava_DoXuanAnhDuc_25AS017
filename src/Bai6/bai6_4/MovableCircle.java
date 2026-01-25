package Bai6.bai6_4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int xSpeed, int ySpeed, int y, int radius) {
        center = new MovablePoint(x,xSpeed, y, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "(" +
                "x" +
                ", y)" +
                " Speed= (" + center.xSpeed +
                "," + center.ySpeed +
                "), radius= "+ radius;
    }
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x+= center.xSpeed;
    }
}
