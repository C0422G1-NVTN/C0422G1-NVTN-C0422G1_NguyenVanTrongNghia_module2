package s2_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        int numberOfPrimes = Integer.parseInt(inputNumber.nextLine());
        int count = 0;
        int n = 2;

        while (count < numberOfPrimes) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }if (flag){
                System.out.println(n);
                count++;
            }
        n++;
        }
    }
}
