package session05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int choice;

        do {
            System.out.println("******** MENU ********");
            System.out.println("1. Thêm tên sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm tên chứa từ khóa");
            System.out.println("4. Đếm tên bắt đầu bằng chữ cái");
            System.out.println("5. Sắp xếp A-Z");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập tên: ");
                    names.add(sc.nextLine().trim());
                }
                case 2 -> names.forEach(System.out::println);
                case 3 -> {
                    System.out.print("Nhập từ khóa: ");
                    String keyword = sc.nextLine().toLowerCase();
                    names.stream().filter(n -> n.toLowerCase().contains(keyword)).forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Nhập chữ cái: ");
                    char c = sc.nextLine().toLowerCase().charAt(0);
                    long count = names.stream().filter(n -> !n.isEmpty() && Character.toLowerCase(n.charAt(0)) == c).count();
                    System.out.println("Số tên bắt đầu bằng '" + c + "': " + count);
                }
                case 5 -> {
                    Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
                    System.out.println("Đã sắp xếp.");
                }
                case 6 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
        sc.close();
    }
}
