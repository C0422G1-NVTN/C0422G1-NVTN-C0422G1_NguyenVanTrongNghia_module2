package s13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchMaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            if (list.size()>1 && list.getLast() > str.charAt(i)){
                list.clear();
            }
            list.add(str.charAt(i));

            if (list.size()>listMax.size()){
                listMax.clear();
                listMax.addAll(list);
            }
        }
        for (Character c: listMax) {
            System.out.print(c);
        }
    }
}
