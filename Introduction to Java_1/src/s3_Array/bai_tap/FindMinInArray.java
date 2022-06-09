package s3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Index In Array");
        for (int i = 0; i < array.length; i++) {
           array[i] = Integer.parseInt(scanner.nextLine());
            System.out.println("Array is : " + Arrays.toString(array));
        }
        System.out.println("Output Min In Array " + findMinInArray(array));
    }
    public static int findMinInArray (int[]array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }   return min;
    }
}
