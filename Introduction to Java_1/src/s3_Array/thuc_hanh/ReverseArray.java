package s3_Array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử của mảng");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int first = array[0], last = array.length - 1, cupNumber;
        for (int i = 0; i < array.length-1/2 ; i++) {
            cupNumber = first;
            first = last;
            last = cupNumber;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(array));
    }
}

