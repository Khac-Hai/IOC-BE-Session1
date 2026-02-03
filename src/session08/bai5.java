package session08;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("===== MENU SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Tìm sinh viên GPA cao nhất");
            System.out.println("4. In tổng số sinh viên đã tạo");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên #" + (i + 1));
                        System.out.print("Mã số: ");
                        String id = scanner.nextLine();
                        System.out.print("Họ tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Điểm trung bình: ");
                        double gpa = scanner.nextDouble();
                        scanner.nextLine();
                        students.add(new Student(id, name, gpa));
                    }
                    break;
                case 2:
                    System.out.println("=== Danh sách sinh viên ===");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("Chưa có sinh viên nào.");
                    } else {
                        Student top = students.get(0);
                        for (Student s : students) {
                            if (s.getGpa() > top.getGpa()) {
                                top = s;
                            }
                        }
                        System.out.println("Sinh viên có GPA cao nhất:");
                        System.out.println(top);
                    }
                    break;
                case 4:
                    System.out.println("Tổng số sinh viên đã tạo: " + Student.getCount());
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

class Student {
    private String id;
    private String name;
    private double gpa;
    private static int count = 0;
    public static final double GPA_FACTOR = 0.25;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        count++;
    }

    public double getGpa() {
        return gpa;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, GPA: %.2f", id, name, gpa);
    }
}
