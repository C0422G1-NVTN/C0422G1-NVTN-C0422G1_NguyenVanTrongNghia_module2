package s3_Array.bai_tap;

import java.util.Scanner;

public class SumColumOfArray2D {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m, n;
        System.out.println("enter m:");
        m = in.nextInt();
        System.out.println("enter n:");
        n = in.nextInt();
        int[][] array2d = new int[m][n];
        int i = 0, j, k, a;
        while (i < array2d.length) {
            for (j = 0; j < array2d[i].length; j++) {
                System.out.println("enter element :" + i + j);
                array2d[i][j] = in.nextInt();
            }
            i++;
        }
        System.out.println("enter col:");
        int col = in.nextInt();
        int sum = 0;
        for (a = 0; a < array2d.length; a++) {
            for (k = 0; k < array2d[a].length; k++) {
                if (col == k) {
                    sum += array2d[a][k];
                }
            }
        }
        System.out.println("sum of col " + col + "=" + sum);
    }
}
