package s6_ke_thua.thuc_hanh;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color,Boolean filled,double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
       return Math.pow(radius ,2)* Math.PI;
    }

    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + getArea() +
                "perimeter=" + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
    }
}
