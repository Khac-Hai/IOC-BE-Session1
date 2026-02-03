package session12.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Staff> staffList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== MENU CHỨC NĂNG =====");
            System.out.println("1. Thêm mới nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Cập nhật thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Thoát chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStaff();
                case 2 -> displayStaff();
                case 3 -> updateStaff();
                case 4 -> deleteStaff();
                case 5 -> System.out.println("Đã thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    static void addStaff() {
        System.out.println("Chọn loại nhân viên:");
        System.out.println("1. Giảng viên");
        System.out.println("2. Nhân viên hành chính");
        System.out.print("Lựa chọn của bạn: ");
        int type = sc.nextInt();

        System.out.print("Nhập mã nhân viên: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine();

        System.out.print("Nhập lương cơ bản: ");
        double baseSalary = sc.nextDouble();

        if (type == 1) {
            System.out.print("Nhập số giờ giảng dạy: ");
            int hours = sc.nextInt();
            staffList.add(new Lecturer(id, name, baseSalary, hours));
        } else if (type == 2) {
            System.out.print("Nhập tiền thưởng: ");
            double bonus = sc.nextDouble();
            staffList.add(new AdminStaff(id, name, baseSalary, bonus));
        } else {
            System.out.println("Loại nhân viên không hợp lệ!");
        }
    }

    static void displayStaff() {
        System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");
        for (Staff s : staffList) {
            s.display(); // Runtime Polymorphism
        }
    }

    static void updateStaff() {
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        int id = sc.nextInt();

        for (Staff s : staffList) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Nhập tên mới: ");
                s.name = sc.nextLine();

                System.out.print("Nhập lương cơ bản mới: ");
                s.baseSalary = sc.nextDouble();

                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên!");
    }

    static void deleteStaff() {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        int id = sc.nextInt();
        staffList.removeIf(s -> s.getId() == id);
        System.out.println("Đã xóa (nếu tồn tại).");
    }
}
