package bai6_1;

public class Square extends Rectangle{
    public Square(){
        super(1.0,1.0);   //constructor mặc định, tạo hình vuông có cạnh 1.0
    }
    public Square(double side){
        super(side,side);  //constructor tạo hình vuông có cạnh side
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);   //constructor tạo màu sắc, trạng thái tô màu, cạnh
    }
    public double getSide(double side){  //method lấy độ dài hình vuông
        return getWidth(); //vì trong hình vuông nên length và width bằng nhau, nên chỉ cần trả về giá trị 1 trong 2
    }
    public void setSide(double side){
        setLength(side);     //method đặt giá trị cho cạnh hình vuông
        setWidth(side);      //đồng thời cập nhật cả 2 cạnh width và length =>đảm bảo length và width luôn bằng nhau
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);  //thiết lập 1 cạnh phải thiết lập luôn cạnh kia
        setWidth(side);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Square" +
                super.toString()
                ;
    }
}
