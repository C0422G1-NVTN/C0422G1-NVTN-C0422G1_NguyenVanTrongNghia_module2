package s2_loop.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;
        while (number<100){
           boolean flag = true;
            for (int i = 2; i < number ; i++) {
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                System.out.println(number);
            }
            number++;
        }
    }
}
