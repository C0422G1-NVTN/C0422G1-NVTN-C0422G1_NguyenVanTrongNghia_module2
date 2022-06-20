package s11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palidrome_su_dung_queue;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi Palindrome");
        else
            System.out.println("Đây không phải là chuỗi Palindrome.");
    }
    }

