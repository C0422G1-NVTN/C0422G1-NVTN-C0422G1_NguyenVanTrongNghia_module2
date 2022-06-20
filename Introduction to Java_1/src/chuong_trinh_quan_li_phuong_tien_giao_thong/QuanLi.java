package chuong_trinh_quan_li_phuong_tien_giao_thong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuanLi {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Transport> transports = new ArrayList<>();

    static {
        transports.add(new Oto("77100", "Honda", 1998, "Nghia", 7, "xe khách"));
        transports.add(new Motorcycle("43578", "Suzuki", 1994, "Trung", 150));
        transports.add(new Truck("33445", "Yamaha", 1980, "Truong", 15));
    }

    void display() {
        for (int i = 0; i < transports.size(); i++) {
            System.out.println(i+1+ " " + transports.get(i));
        }
    }

    public void add() {
        System.out.println("1.Oto");
        System.out.println("2.Motorcycle");
        System.out.println("3.Truck");
        System.out.println("Nhập loại xe muốn thêm");
        int choseCar = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập biển kiểm soát");
        String numberPlate = scanner.nextLine();
        System.out.println("Nhập tên nơi sản xuất");
        String nameManufactoring = scanner.nextLine();
        System.out.println("Nhập ngày sản xuất");
        int yearManufactoring = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String owner = scanner.nextLine();

        switch (choseCar) {
            case 1:
                System.out.println("Oto");
                System.out.println("Nhập số chỗ ngồi");
                int numberSeats = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập loại xe ô tô");
                String styleOto = scanner.nextLine();
                transports.add(new Oto(numberPlate, nameManufactoring, yearManufactoring, owner, numberSeats, styleOto));
                break;
            case 2:
                System.out.println("Motorcycle");
                System.out.println("Nhập công suất");
                int wattage = Integer.parseInt(scanner.nextLine());
                transports.add(new Motorcycle(numberPlate, nameManufactoring, yearManufactoring, owner, wattage));
                break;
            case 3:
                System.out.println("Truck");
                System.out.println("Nhập trọng tải");
                double tonnage = Double.parseDouble(scanner.nextLine());
                transports.add(new Truck(numberPlate, nameManufactoring, yearManufactoring, owner, tonnage));
                break;
        }
    }

    public void delete(int index){ // xóa theo index
        transports.remove(index);
    }

    public void deleteName (String name){ // xóa theo tên nha
        for (int i = 0; i < transports.size(); i++) {
            if (transports.get(i).getNameManufacturing().equals(name)){ //trích xuất name của phần tử i có giống name nhập vào ko
                transports.remove(i);
            }
        }
    }
}
