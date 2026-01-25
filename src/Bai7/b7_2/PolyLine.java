package Bai7.b7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    // default constructor
    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    // append (x,y)
    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    // append Point
    public void appendPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point p : points) {
            sb.append(p.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    // total length
    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i - 1).distance(points.get(i));
        }
        return length;
    }
}
