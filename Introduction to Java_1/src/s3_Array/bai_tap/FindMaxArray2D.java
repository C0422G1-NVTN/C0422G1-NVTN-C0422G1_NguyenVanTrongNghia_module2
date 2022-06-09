package s3_Array.bai_tap;

import java.util.Scanner;

public class FindMaxArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Input col");
        int col = Integer.parseInt(scanner.nextLine());
        int array[][] = new int[row][col];

        System.out.println(" Input Array");
        inputArray2D(array);
        System.out.println(" Output Array");
        outputArray2D(array);
        System.out.println("Max Index : " + findMaxArray2D(array));
    }

    public static void inputArray2D(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("arr [" + i + "][" + j + "] = ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println();
    }

    public static void outputArray2D(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("arr [" + i + "][" + j + "]");
            }
        }
        System.out.println();
    }

    public static int findMaxArray2D(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
