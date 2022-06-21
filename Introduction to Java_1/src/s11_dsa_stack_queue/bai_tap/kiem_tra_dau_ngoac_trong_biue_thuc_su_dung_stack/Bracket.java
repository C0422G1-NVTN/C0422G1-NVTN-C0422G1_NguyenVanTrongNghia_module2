package s11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_biue_thuc_su_dung_stack;

import java.util.Stack;

public class Bracket {
    public static boolean testBracket(String s) {
        Stack<Character> bStack = new Stack<>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);

            if (sym == '(') {
                bStack.push(sym);
            }

            if (sym == ')') {
                if (bStack.isEmpty()){
                    return result= false;
                }else {
                    bStack.pop();
                }
            }if (bStack.isEmpty()){
                result= true;
            }else result= false;
        }

        return result;
    }

    public static void main(String[] args) {

    System.out.println(testBracket("()()()()()"));
    }
}
