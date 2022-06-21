package s12_java_collection_framewwork.bai_tap.controller;

import s12_java_collection_framewwork.bai_tap.model.Product;
import s12_java_collection_framewwork.bai_tap.services.impl.ProductServices;

import java.util.Scanner;

public class MainController {
    public static ProductServices productServices = new ProductServices();

    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ THÔNG TIN SẢN PHẨM" +
                    "\n Chọn chức năng:" +
                    "\n 1. Thêm sản phẩm" +
                    "\n 2. Sửa thông tin sản phẩm theo id" +
                    "\n 3. Xoá sản phẩm theo id" +
                    "\n 4. Hiển thị danh sách sản phẩm" +
                    "\n 5. Tìm kiếm sản phẩm theo tên" +
                    "\n 6. Sắp xếp sản phẩm tăng dần giảm dần theo giá" +
                    "\n 7. Thoát");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productServices.addProduct();
                    break;
                case 2:
                    productServices.editById();
                    break;
                case 3:
                    productServices.deleteById();
                    break;
                case 4:
                    productServices.displayProductList();
                    break;
                case 5:
                    productServices.searchProductByName();
                    break;
                case 6:
                    System.out.println("1.Giá tăng dần");
                    System.out.println("2.Giá giảm dần");
                    int i1 = Integer.parseInt(scanner.nextLine());
                    if (i1==1){
                        productServices.sortProductsByPrice();
                    }else if (i1==2){
                        productServices.decrease();
                    }else break;
                case 7:
                    flag = false;
                default:
                    System.out.println("Nhập lại chức năng!");
                    break;
            }
        } while (flag);
    }
}
