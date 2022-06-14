package s6_ke_thua.bai_tap.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"blue");
        System.out.println(circle.toString());
    }
}
