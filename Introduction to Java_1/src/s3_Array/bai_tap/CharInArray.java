package s3_Array.bai_tap;

import java.util.Scanner;

public class CharInArray {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string:");
        str = scanner.nextLine();
        System.out.println(str);
        System.out.println("enter a 1 character:");
        char s = 'a';
        int i, count = 0;
        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == s){
                count++;
            }
        }
        System.out.println("char " + s + " appear " + count);
    }
}
