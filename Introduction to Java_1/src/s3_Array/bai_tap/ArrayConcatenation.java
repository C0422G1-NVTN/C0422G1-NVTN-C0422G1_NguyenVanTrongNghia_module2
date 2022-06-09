package s3_Array.bai_tap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int []array1 = new int[5];
        int []array2 = new int[4];

        System.out.println("Nhập phần tử của array1 :");
        inputArray(array1);
        System.out.println("Mảng 1 là : " + Arrays.toString(array1));
        System.out.println();

        System.out.println("Nhập phần tử của array2 :");
        inputArray(array2);
        System.out.println("Mảng 2 là : " + Arrays.toString(array2));
        System.out.println();

        int []array3 = new int[array1.length + array2.length];//độ dài mảng 3 bằng 2 mảng cộng lại
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length+i] = array2[i];
        }
        System.out.println("Mảng 3 là : " + Arrays.toString(array3));
    }

    public static void inputArray(int[]array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }
}

