package s4_Oop.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width = ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height = ");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Rectangle is " + rectangle.display());
        System.out.println("Area Rectangle is " + rectangle.getArea());
        System.out.println("Perimeter Rectangle is " + rectangle.getPerimeter());
    }
}
