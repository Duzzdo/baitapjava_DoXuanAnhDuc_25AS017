package bai5_1;

public class LineSub extends Point{
    Point end;

    //Constructor nhận 4 gia trị int
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX,beginY);   //Khởi tạo điểm bắt đầu (x,y)
        this.end = new Point(endX,endY);  //khởi tạo điểm end (x,y) mới cho Point
    }

    //Constructor nhận 2 đối tượng Point
    public LineSub(Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end=end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                super.toString()+
                ", " + end +
                '}';
    }
    public Point getBegin(){ //trả về 1 đối tượng Point mới với tọa độ điểm ban đầu
        return new Point(super.getX(),super.getY()); //(super.getX() và super.getY() lấy (x,y) của lớp cha Point
    }
    public void setBegin(Point begin){
        super.setX(begin.getX());
        super.setY(begin.getY());
        //Dùng các phương thước setter của lớp Point để thay đổi giá trị x
    }


    public Point getEnd() {  //Lấy điểm kết thúc
        return end;
    }

    public void setEnd(Point end) { //Thiết lập điểm kết thúc
        this.end = end;
    }
    public int getBeginX(){
        return super.getX();  //x của lớp Point là x của điểm bắt đầu
    }
    public int getBeginY(){
        return super.getY();  //y của lớp Point là y của điểm bắt đầu
    }

    public int getEndX(){
        return end.getX();  //x của đối tượng end
    }
    public int getEndY(){
        return end.getY();  //y của đối tượng end
    }
    public void setBeginX(int beginX){
        super.setX(beginX);  //set x của lớp cha
    }
    public void setBeginY(int beginY){
        super.setY(beginY);  //set y của lớp cha
    }
    public void setBeginXY(int beginX, int beginY){
        super.setXY(beginX,beginY); //set cả x,y của lớp cha
    }
    public void setEndX(int endX){
        end.setX(endX); // set x của đối tương end
    }
    public void setEndY(int endY){
        end.setY(endY);  //set y của đối tượng end
    }
    public void setEndXY(int endX,int endY){
        end.setXY(endX,endY);  // set cả x,y của đối tượng end
    }
    public int getLength(){
        int xDiff= end.getX() - super.getX();
        int yDiff= end.getY() - super.getY();
        return (int) Math.sqrt(xDiff*xDiff+yDiff*yDiff); //ép kiểu int vì Math.sqrt mang kiểu double
    }
    public double getGradient(){
        int xDiff= end.getX() - super.getX();
        int yDiff= end.getY() - super.getY();
        return Math.atan2(yDiff,xDiff);
    }
}
