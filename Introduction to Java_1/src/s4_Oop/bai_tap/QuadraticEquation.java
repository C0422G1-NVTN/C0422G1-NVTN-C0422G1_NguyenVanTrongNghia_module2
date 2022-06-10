package s4_Oop.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;



    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant(){
       return Math.pow(this.b,2) - 4*this.a*this.c;
    }

    public double getRoot1(){
         return (-this.b+Math.pow(Math.pow(this.b,2) - 4*this.a*this.c, 0.5))/2*this.a;
    }

    public double getRoot2(){
        return (-this.b-Math.pow(Math.pow(this.b,2) - 4*this.a*this.c, 0.5))/2*this.a;
    }

    public void display() {
        if (this.getDiscriminant() > 0) {
            System.out.println("Equation has 2 solutions");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (this.getDiscriminant() == 0) {
            System.out.println("Equation has 2 solution");
            System.out.println("x = " + getRoot1());
        } else System.out.println("The equation has no roots");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Input c");
        double c = Double.parseDouble(scanner.nextLine());

    QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Delta là : " + quadraticEquation.getDiscriminant());
    quadraticEquation.display();

    }
}
