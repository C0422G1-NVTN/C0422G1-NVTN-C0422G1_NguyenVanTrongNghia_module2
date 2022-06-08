package s2_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn kiểm tra");
        int number = Integer.parseInt(scanner.nextLine());
        boolean checkNumber = true;
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    checkNumber = false;
                    break;
                }
                i++;
            }
        }if (checkNumber)
            System.out.println(number + " is a prime");
        else
            System.out.println(number + " is not a prime");

    }
}
