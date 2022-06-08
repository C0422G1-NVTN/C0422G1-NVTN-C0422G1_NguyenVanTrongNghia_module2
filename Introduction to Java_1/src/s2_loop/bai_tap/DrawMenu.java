package s2_loop.bai_tap;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();

                    }
                    break;
                case 2:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 3:
                    for (int i = 1; i <=3 ; i++) {
                        for (int j = (3-i); j >= 1 ; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=(2*i-1) ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No Choice");
            }
        }
    }
}
