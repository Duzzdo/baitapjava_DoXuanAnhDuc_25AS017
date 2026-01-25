package Bai3.b3_6;

public class Container {
    private int x1,y1,x2,y2;

    public Container(int x,int y,int w,int h){
        x1=x; y1=y; x2=x+w; y2=y+h;
    }

    public boolean collides(Ball b){
        return b.getX()-b.getRadius()<=x1 ||
                b.getX()+b.getRadius()>=x2 ||
                b.getY()-b.getRadius()<=y1 ||
                b.getY()+b.getRadius()>=y2;
    }
}
