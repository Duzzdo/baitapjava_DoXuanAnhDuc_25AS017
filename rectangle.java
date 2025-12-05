public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;

    public  Rectangle(){

    }
    public Rectangle( float l, float w){
        this.length=l;
        this.width=w;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }


    public String toString(){
        return "Rectangle[length=" +length + ",width=" +width + "]";
    }
}

