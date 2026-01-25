package Bai5.bai5_2;

public class Main {
    static void main(String[] args) {
        Cylinder cy1= new Cylinder();
        System.out.println(cy1.getRadius());
        System.out.println(cy1.getHeight());
        System.out.println(cy1.getVolume());
        Cylinder cy2= new Cylinder(2.0,5.1);
        System.out.println(cy2.getRadius());
        System.out.println(cy2.getHeight());
        System.out.println(cy2.getVolume());
        Cylinder cy3= new Cylinder(3.0,4.0,"blue");
        System.out.println(cy3.getHeight());
        System.out.println(cy3.getRadius());
        System.out.println(cy3.getVolume());
        System.out.println(cy3.toString());

    }
}
