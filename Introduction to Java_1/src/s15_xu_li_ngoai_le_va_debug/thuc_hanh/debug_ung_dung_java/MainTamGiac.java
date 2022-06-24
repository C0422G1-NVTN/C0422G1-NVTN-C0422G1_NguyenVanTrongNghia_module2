package s15_xu_li_ngoai_le_va_debug.thuc_hanh.debug_ung_dung_java;

import java.util.Scanner;

public class MainTamGiac extends  TamGiascLoi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
       TamGiac tamGiac = new TamGiac();
        try {
            tamGiac.check(a,b,c);
        } catch (TamGiascLoi e) {
            e.printStackTrace();
        }
    }
}
