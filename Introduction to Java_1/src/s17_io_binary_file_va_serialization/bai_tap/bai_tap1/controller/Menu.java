package s17_io_binary_file_va_serialization.bai_tap.bai_tap1.controller;

import s17_io_binary_file_va_serialization.bai_tap.bai_tap1.Services.impl.ProductImplService;

import java.util.Scanner;

public class Menu {
        public static void displayMenu(){
ProductImplService productImplService = new ProductImplService();//TẠO ĐỐI TƯỢNG NẾU KO CÓ KHỐI STATIC
            boolean flag = true;
            do {
                System.out.println("CHƯƠNG TRÌNH QUẢN LÍ HÀNG HÓA" +
                        "\n Chọn chức năng:" +
                        "\n 1. Thêm mới hàng hóa" +
                        "\n 2. Hiển thị hàng hóa" +
                        "\n 3. Tìm kiếm hàng hóa theo tên sản phẩm" +
                        "\n 4. Thoát");

                Scanner scanner = new Scanner(System.in);
                System.out.print("Chọn chức năng: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Thêm mới hàng hóa");
                        productImplService.add();
                        break;
                    case 2:
                        System.out.println("Hiển thị hàng hóa");
                        productImplService.display();
                        break;
                    case 3:
                        System.out.println("Tìm kiếm hàng hóa theo tên sản phẩm");
                        productImplService.search();
                        break;
                    case 4:
                        flag = false;
                        System.out.println("See you later");
                    default:
                        System.out.println("Nhập lại chức năng!");
                }
            }while (flag);
        }
    }

