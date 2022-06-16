package c_r_o_d;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "KaKa", "Brazil", true, "KaKa email");
        students[1] = new Student(2, "Ronaldo", "Portugal", true, "Ronaldo email");
        students[2] = new Student(3, "Benzema", "France", true, "Benzema email");
    }

    // CRUD
    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }

    public void add() {
//        System.out.println("Input id");
//        int id = Integer.parseInt(scanner.nextLine());
        int id = Student.count+1;
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input address");
        String address = scanner.nextLine();
        System.out.println("Input gender");
        Boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Input email");
        String email = scanner.nextLine();
        Student student = new Student(id, name, address, gender, email);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void delete() {
        System.out.println("Input Delete");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (number == students[i].getId()) {
                students[i] = null;
                break;
            }
        }
    }

    public void edit(int id) {
        if ( id > 0 && id <= 100) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    System.out.println("Input new id ");
                    students[i].setId(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Input new name ");
                    students[i].setName(scanner.nextLine());
                    System.out.println("Input new gender ");
                    students[i].setGender(Boolean.parseBoolean(scanner.nextLine()));
                    System.out.println("Input new email ");
                    students[i].setEmail(scanner.nextLine());
                    break;
                }
            }
        }
    }

    public void search(String name) {
        for (int i = 0; i < students.length; i++) {
            if (name.equalsIgnoreCase(students[i].getName())) { // equal: kiểm tra giá trị của 2 chuỗi có gioosnbg nhau không
                System.out.println(students[i].toString());
                break;
            }
        }

    }
}


