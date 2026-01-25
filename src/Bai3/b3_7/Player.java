package Bai3.b3_7;

public class Player {
    private int number;
    private float x,y,z=0;

    public Player(int number,float x,float y){
        this.number=number; this.x=x; this.y=y;
    }

    public void move(float dx,float dy){ x+=dx; y+=dy; }
    public void jump(float dz){ z+=dz; }

    public boolean near(Ball b){
        double d=Math.sqrt(Math.pow(x-b.getX(),2)+Math.pow(y-b.getY(),2));
        return d<8;
    }

    public void kick(Ball b){
        if(near(b)) System.out.println("Kick!");
    }
}
