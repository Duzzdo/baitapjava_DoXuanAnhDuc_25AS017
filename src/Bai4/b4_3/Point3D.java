package Bai4.b4_3;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this(0, 0, 0);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
