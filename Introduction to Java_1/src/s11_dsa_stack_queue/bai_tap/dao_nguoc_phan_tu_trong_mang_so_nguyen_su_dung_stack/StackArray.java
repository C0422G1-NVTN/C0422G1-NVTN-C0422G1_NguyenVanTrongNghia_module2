package s11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stacks = new Stack<>();
        System.out.println("Nhập số lượng phần tử ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] arrays = new int [n];
        for (int i = 0; i < n ; i++) {
            arrays[i] = Integer.parseInt(scanner.nextLine());
            stacks.push(arrays[i]);
        }
        System.out.println("Mảng trước khi đảo");
        System.out.println(Arrays.toString(arrays));
        for (int i = 0; i < n ; i++) {
            arrays[i] = stacks.pop();
        }
        System.out.println("Mảng sau khi đảo");
        System.out.println(Arrays.toString(arrays));
    }
}
