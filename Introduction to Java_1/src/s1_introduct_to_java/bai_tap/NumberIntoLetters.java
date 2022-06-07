package s1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class NumberIntoLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 10){
            switch (number){
                case 0:
                    System.out.print(" Zero ");
                    break;
                case 1:
                    System.out.print(" One ");
                    break;
                case 2:
                    System.out.print(" Two ");
                    break;
                case 3:
                    System.out.print(" Three ");
                    break;
                case 4:
                    System.out.print(" Four ");
                    break;
                case 5:
                    System.out.print(" Five ");
                    break;
                case 6:
                    System.out.print(" Six ");
                    break;
                case 7:
                    System.out.print(" Seven ");
                    break;
                case 8:
                    System.out.print(" Eight ");
                    break;
                case 9:
                    System.out.print(" Nine ");
                    break;
            }
        }else if (number < 20){
            switch (number){
                case 11:
                    System.out.print(" Eleven ");
                    break;
                case 12:
                    System.out.print(" Twelve ");
                    break;
                case 13:
                    System.out.print(" Thirteen ");
                    break;
                case 14:
                    System.out.print(" Fourteen ");
                    break;
                case 15:
                    System.out.print(" Fifteen ");
                    break;
                case 16:
                    System.out.print(" Sixteen ");
                    break;
                case 17:
                    System.out.print(" Seventeen ");
                    break;
                case 18:
                    System.out.print(" Eighteen ");
                    break;
                case 19:
                    System.out.print(" Nineteen ");
                    break;
            }
        }else if (number < 100){
            int number1 = number / 10;
            int number2 = number % 10;

            switch (number1){
                case 2:
                    System.out.print(" Twenty ");
                    break;
                case 3:
                    System.out.print(" Thirty ");
                    break;
                case 4:
                    System.out.print(" Forty ");
                    break;
                case 5:
                    System.out.print(" Fifty ");
                    break;
                case 6:
                    System.out.print(" Sixty ");
                    break;
                case 7:
                    System.out.print(" Seventy ");
                    break;
                case 8:
                    System.out.print(" Eighty ");
                    break;
                case 9:
                    System.out.print(" Ninety ");
                    break;
            }
            switch (number2){
                case 1:
                    System.out.print(" One ");
                    break;
                case 2:
                    System.out.print(" Two ");
                    break;
                case 3:
                    System.out.print(" Three ");
                    break;
                case 4:
                    System.out.print(" Four ");
                    break;
                case 5:
                    System.out.print(" Five ");
                    break;
                case 6:
                    System.out.print(" Six ");
                    break;
                case 7:
                    System.out.print(" Seven ");
                    break;
                case 8:
                    System.out.print(" Eight ");
                    break;
                case 9:
                    System.out.print(" Nine ");
                    break;
            }
        }else if (number < 1000) {
            int number1 = number / 100;
            int number2 = (number / 10) % 10;
            int number3 = number % 10;
            switch (number1) {
                case 1:
                    System.out.print("One" + "hundred");
                    break;
                case 2:
                    System.out.print("Two" + "hundred");
                    break;
                case 3:
                    System.out.print("Three" + "hundred");
                    break;
                case 4:
                    System.out.print("Four" + "hundred");
                    break;
                case 5:
                    System.out.print("Five" + "hundred");
                    break;
                case 6:
                    System.out.print("Six" + "hundred");
                    break;
                case 7:
                    System.out.print("Seven" + "hundred");
                    break;
                case 8:
                    System.out.print("Eight" + "hundred");
                    break;
                case 9:
                    System.out.print("Nine" + "hundred");
                    break;
            }
            if (number2 == 1) {
                switch (number3) {
                    case 0:
                        System.out.print(" Ten ");
                    case 1:
                        System.out.print(" Eleven ");
                        break;
                    case 2:
                        System.out.print(" Twelve ");
                        break;
                    case 3:
                        System.out.print(" Thirteen ");
                        break;
                    case 4:
                        System.out.print(" Fourteen ");
                        break;
                    case 5:
                        System.out.print(" Fifteen ");
                        break;
                    case 6:
                        System.out.print(" Sixteen ");
                        break;
                    case 7:
                        System.out.print(" Seventeen ");
                        break;
                    case 8:
                        System.out.print(" Eighteen ");
                        break;
                    case 9:
                        System.out.print(" Nineteen ");
                        break;
                }
            } else {
                switch (number2) {
                    case 2:
                        System.out.print(" Twenty ");
                        break;
                    case 3:
                        System.out.print(" Thirty ");
                        break;
                    case 4:
                        System.out.print(" Forty ");
                        break;
                    case 5:
                        System.out.print(" Fifty ");
                        break;
                    case 6:
                        System.out.print(" Sixty ");
                        break;
                    case 7:
                        System.out.print(" Seventy ");
                        break;
                    case 8:
                        System.out.print(" Eighty ");
                        break;
                    case 9:
                        System.out.print(" Ninety ");
                        break;
                }
                switch (number3) {
                    case 1:
                        System.out.print(" One ");
                        break;
                    case 2:
                        System.out.print(" Two ");
                        break;
                    case 3:
                        System.out.print(" Three ");
                        break;
                    case 4:
                        System.out.print(" Four ");
                        break;
                    case 5:
                        System.out.print(" Five ");
                        break;
                    case 6:
                        System.out.print(" Six ");
                        break;
                    case 7:
                        System.out.print(" Seven ");
                        break;
                    case 8:
                        System.out.print(" Eight ");
                        break;
                    case 9:
                        System.out.print(" Nine ");
                        break;
                }
            }
        }
    }
}
