package s3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(myArray));
        Scanner scn = new Scanner(System.in);
        int indexDel;
        System.out.println("Enter element delete: ");
        indexDel = scn.nextInt();
        delElement(myArray, indexDel);
        System.out.println(Arrays.toString(myArray));
    }

    public static void delElement(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                for (int j = i; j < array.length-1 ; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
    }
}
