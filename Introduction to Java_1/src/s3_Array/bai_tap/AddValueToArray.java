package s3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddValueToArray {
    public static void main(String[] args) {
        int []array = {3,4,5,6,7,8,0,0,0,0};
        System.out.println("Mảng của bạn là : " + Arrays.toString(array));

        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập giá trị cần chèn vào mảng");
        int value = Integer.parseInt(scn.nextLine());
        System.out.println("Nhập vị trí phần tử cần chèn");
        int index = Integer.parseInt(scn.nextLine());
            for (int j = array.length-1; j > index ; j--) {
                array[j]=array[j-1];
            }array[index]=value;

        System.out.println("Mảng sau khi thêm giá trị " + value + " vào vị trí thứ " + index + " là " + Arrays.toString(array));
    }
}
