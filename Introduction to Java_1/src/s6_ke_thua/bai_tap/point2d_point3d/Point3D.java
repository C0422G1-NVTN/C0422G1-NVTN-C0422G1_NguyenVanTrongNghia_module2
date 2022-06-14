package s6_ke_thua.bai_tap.point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array3d = {super.getX(), super.getY(), this.z};
        return array3d;
    }

    @Override
    public String toString() {
        return "Array3D = (" + getXYZ()[0] + ","
                + getXYZ()[1] + ","
                + getXYZ()[2] + ")";
    }

    public static void main(String[] args) {
        Point3D array3d = new Point3D(3, 5, 8);
        System.out.println(array3d);
    }
}
