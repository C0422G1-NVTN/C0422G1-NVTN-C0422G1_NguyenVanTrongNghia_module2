package chuong_trinh_quan_li_phuong_tien_giao_thong;

import java.util.ArrayList;
import java.util.Scanner;

public class RunTransport {
    public static void main(String[] args) {
        QuanLi quanLi = new QuanLi();
        int check;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG!");

            System.out.println("1.Thêm mới phương tiện");

            System.out.println("2.Hiển thị phương tiện");

            System.out.println("3.Xóa phương tiện");

            System.out.println("4.Tìm kiếm theo biển kiểm soát");

            System.out.println("5.Thoát");

            System.out.println("Nhập vào chức năng muốn dùng");
            check = Integer.parseInt(input.nextLine());
            switch (check) {
                case 1:
                    System.out.println("Thêm mới phương tiện");
                    quanLi.add();
                    break;
                case 2:
                System.out.println("Hiển thị phương tiện");
                quanLi.display();
                    break;
                case 3:
//                    System.out.println("Nhập vào số thứ tự muốn xóa ");
//                    int index = Integer.parseInt(input.nextLine());
//                    quanLi.delete(index);
//                    System.out.println("đã xóa xong- nhấn phím 2 để hiển thị danh sách phương tiện");
//                    System.out.println("Nhập tên muốn xóa");
//                    String name = input.nextLine();
//                    quanLi.deleteName1(name);
                    System.out.println("Nhập name");
                    String name = input.nextLine();
//                    for (int i = 0; i <  ; i++) {
//
//                    }
                case 4:

            }


        } while (check < 5);
    }
}
