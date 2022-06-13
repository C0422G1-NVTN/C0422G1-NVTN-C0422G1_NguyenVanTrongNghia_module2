package s5_access_modifier_static_method_static_property.bai_tap;

import java.util.Scanner;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        Circle testCircle = new Circle();
        testCircle.setRadius(inputRadius.nextDouble());
        System.out.println(testCircle.getRadius());
        System.out.println("Output Area = " + testCircle.getArea());
    }
}


