package s1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class UsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Usd");
        long usd = Long.parseLong(scanner.nextLine());
        long vnd = usd * 23000;
        System.out.println(usd + " usd sau khi đổi ra tiền vnd là : " + vnd);
    }
}
