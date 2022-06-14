package s6_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "\nheight=" + height +
                "\nVolumeCylinder=" + getVolume() +
                "\n" +
                 super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.0,"blue",2.0);
        System.out.println(cylinder);
    }
}
