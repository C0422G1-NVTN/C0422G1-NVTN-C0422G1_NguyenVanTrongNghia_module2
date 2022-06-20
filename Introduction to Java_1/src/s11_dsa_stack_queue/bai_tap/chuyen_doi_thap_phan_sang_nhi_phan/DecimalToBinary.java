package s11_dsa_stack_queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer>integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển qua nhị phân");
        int number = Integer.parseInt(scanner.nextLine());
        while (number>0){
            int number2 = number%2;
            integerStack.push(number2);
            number = number/2;
        }
        while (!integerStack.isEmpty()){
            System.out.println(integerStack.pop());
        }
    }
}
