package s1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class HienThiHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
