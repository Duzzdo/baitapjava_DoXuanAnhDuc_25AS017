package b2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        return a + b + c;
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);

        double eps = 1e-9;

        boolean ab = Math.abs(a - b) < eps;
        boolean bc = Math.abs(b - c) < eps;
        boolean ca = Math.abs(c - a) < eps;

        if (ab && bc) return "Equilateral";
        if (ab || bc || ca) return "Isosceles";
        return "Scalene";
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }
}
