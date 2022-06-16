package c_r_o_d;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        StudentManager studentManager = new StudentManager();
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2.Add" +
                    "\n 3.Delete" +
                    "\n 4.Edit" +
                    "\n 5.Search" +
                    "\n 6.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("chức năng hiển thị");
                    studentManager.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới");
                    studentManager.add();
                    studentManager.display();
                    break;
                case 3:
                    System.out.println("Chức năng xóa");
                    studentManager.delete();
                    studentManager.display();
                    break;
                case 4:
                    System.out.println("Chức năng chỉnh sửa");
                    System.out.print("Nhập id của sinh viên bạn muốn chỉnh sửa");
                    int id = Integer.parseInt(scanner.nextLine());
                    studentManager.edit(id);
                    studentManager.display();
                    break;
                case 5:
                    System.out.print("Nhập tên bạn sinh viên muốn tìm: ");
                    String name = scanner.nextLine();
                    studentManager.search(name);
                    studentManager.display();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Nhập lại đi");
            }

        }while (flag);
    }
}