package Bai3.b3_6;

public class Ball {
    private float x,y;
    private int radius;
    private float xDelta,yDelta;

    public Ball(float x,float y,int radius,int speed,int direction){
        this.x=x; this.y=y; this.radius=radius;
        xDelta = (float)(speed*Math.cos(Math.toRadians(direction)));
        yDelta = (float)(-speed*Math.sin(Math.toRadians(direction)));
    }

    public void move(){ x+=xDelta; y+=yDelta; }
    public void reflectHorizontal(){ xDelta = -xDelta; }
    public void reflectVertical(){ yDelta = -yDelta; }

    public float getX(){ return x; }
    public float getY(){ return y; }
    public int getRadius(){ return radius; }

    @Override
    public String toString(){
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }
}
