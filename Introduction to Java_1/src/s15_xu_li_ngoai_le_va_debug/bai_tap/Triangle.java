package s15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Triangle extends IllegalTriangleException{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
          MyTriangle myTriangle = new MyTriangle();

        try {
            myTriangle.check(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
