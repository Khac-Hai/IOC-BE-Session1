package session12.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Drink> menu = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== COFFEESHOP PRO =====");
            System.out.println("1. Thêm đồ uống");
            System.out.println("2. Hiển thị menu");
            System.out.println("3. Áp dụng mã giảm giá");
            System.out.println("4. Xóa đồ uống");
            System.out.println("5. Thống kê giá trung bình");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addDrink();
                case 2 -> showMenu();
                case 3 -> applyPromotion();
                case 4 -> removeDrink();
                case 5 -> averagePrice();
                case 6 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    // 1. Thêm đồ uống
    static void addDrink() {
        System.out.println("1. Cà phê");
        System.out.println("2. Trà trái cây");
        System.out.print("Chọn loại: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Tên đồ uống: ");
        String name = sc.nextLine();

        System.out.print("Giá: ");
        double price = sc.nextDouble();

        if (type == 1) {
            menu.add(new Coffee(id, name, price));
        } else if (type == 2) {
            menu.add(new FruitTea(id, name, price));
        }
    }

    // 2. Hiển thị menu
    static void showMenu() {
        System.out.println("\n===== MENU ĐỒ UỐNG =====");
        for (Drink d : menu) {
            d.display(); // Polymorphism
        }
    }

    // 3. Áp dụng khuyến mãi
    static void applyPromotion() {
        System.out.print("Nhập % giảm giá: ");
        double percent = sc.nextDouble();

        for (Drink d : menu) {
            d.applyDiscount(percent);
        }
        System.out.println("Đã áp dụng giảm giá!");
    }

    // 4. Xóa đồ uống
    static void removeDrink() {
        System.out.print("Nhập ID đồ uống cần xóa: ");
        int id = sc.nextInt();

        menu.removeIf(d -> d.getId() == id);
        System.out.println("Đã xóa (nếu tồn tại).");
    }

    // 5. Thống kê giá trung bình
    static void averagePrice() {
        if (menu.isEmpty()) {
            System.out.println("Menu đang trống!");
            return;
        }

        double sum = 0;
        for (Drink d : menu) {
            sum += d.getPrice();
        }

        System.out.println("Giá trung bình: " + (sum / menu.size()));
    }
}

