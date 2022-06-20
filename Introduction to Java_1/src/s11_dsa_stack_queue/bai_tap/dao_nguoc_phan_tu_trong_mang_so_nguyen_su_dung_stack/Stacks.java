package s11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String>stringStack = new Stack<>();
        System.out.println("Nhập chuỗi vào");
        String s = scanner.nextLine();
        String[]array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            stringStack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(stringStack.pop() + " ");
        }
    }
}
