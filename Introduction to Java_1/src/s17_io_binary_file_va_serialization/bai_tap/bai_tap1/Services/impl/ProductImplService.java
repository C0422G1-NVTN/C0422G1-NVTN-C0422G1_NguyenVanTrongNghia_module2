package s17_io_binary_file_va_serialization.bai_tap.bai_tap1.Services.impl;

import s17_io_binary_file_va_serialization.bai_tap.bai_tap1.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductImplService implements IProduct {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        List<Product> list = ReadAndWrite.readDataFromFile("src/s17_io_binary_file_va_serialization/bai_tap/Services/impl/Product1.txt");
        System.out.println("CHỨC NĂNG THÊM SẢN PHẨM");
        System.out.println("Nhập mã sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập hãn sản xuất");
        String productCompany = scanner.nextLine();
        System.out.println("Nhập giá");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, productCompany, price);
        list.add(product);
        ReadAndWrite.writeToFile("src/s17_io_binary_file_va_serialization/bai_tap/Services/impl/Product1.txt", list);
        display();
    }

    @Override
    public void display() {
        List<Product> productList = ReadAndWrite.readDataFromFile("src/s17_io_binary_file_va_serialization/bai_tap/Services/impl/Product1.txt");
        for (Product p : productList)
            System.out.println(p);
    }

    @Override
    public void search() {
        List<Product> list = ReadAndWrite.readDataFromFile("src/s17_io_binary_file_va_serialization/bai_tap/Services/impl/Product1.txt");

        System.out.println("CHỨC NĂNG SEARCH");
        System.out.println("Nhập tên sản phẩm cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getCodeProduct()==id) {
                System.out.println(list.get(i));
                flag = false;
                break;
            }
        }
        if (flag) {
            System.err.println("Không tìm thấy sản phẩm " + id);
        }
    }
}

