package bai5_2;

public class Cylinder {
    private Circle base;  //sử dụng base thay extends vì hình trụ ĐƯỢC TẠO NÊN TỪ hình tròn chứ k phải LÀ hình tròn
    private double height;

    public Cylinder() {
        base = new Circle();  //tạo 1 đối tượng Circle mới làm đáy
        height =1.0;
    }

    public Cylinder(double radius, double height) {
        base= new Circle(radius);  //tạo 1 đối tượng Circle để thiết lập bán kính radius
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base= new Circle(radius,color);  //tạo 1 đối tượng Cirle mới để thiết lập radius và color
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius(){
        return base.getRadius();  //vì Cylinder chứ Circle bên trong nên muốn lấy bán kính thì phải lấy từ BASE
    }

    public void setRadius(double radius){
        base.setRadius(radius);  //vì Cylinder chứ Circle bên trong nên muốn thiết lập bán kính thì phải lấy từ BASE
    }

    public double getVolume(){
        return base.getArea()*height;  //dùng phương thức getArea() của đối tượng BASE rồi nhân với chiều cao
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
