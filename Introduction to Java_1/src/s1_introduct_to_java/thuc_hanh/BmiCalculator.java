package s1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Nhập weight");
        weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập height");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight/Math.pow(height,2);
        System.out.println("Chỉ số bmi: " +  bmi );
        if (bmi < 18 ){
            System.out.printf("Underweight");
        }else if (bmi <25.0){
            System.out.println("Normal");
        }else if (bmi < 30.0){
            System.out.println("Overweight");
        }else
            System.out.println("Obese");
    }
}
