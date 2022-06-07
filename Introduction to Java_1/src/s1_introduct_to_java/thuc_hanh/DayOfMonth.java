package s1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng bạn muốn biết ngày");
        int month = Integer.parseInt(scanner.nextLine());

        switch (month) {
            case 2:
                System.out.print("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng '" + month + "' có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng '" + month + "' có 33 ngày ");
                break;
            default:
                System.out.print("Nhập sai");
                break;
        }
    }
}
