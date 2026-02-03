package session12.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Asset> assetList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ TÀI SẢN TECHASSET =====");
            System.out.println("1. Nhập tài sản");
            System.out.println("2. Xuất báo cáo tài sản");
            System.out.println("3. Tìm kiếm tài sản");
            System.out.println("4. Sửa giá mua");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addAsset();
                case 2 -> showAll();
                case 3 -> searchMenu();
                case 4 -> updatePrice();
                case 5 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    // 1. Nhập tài sản
    static void addAsset() {
        System.out.println("1. Máy tính");
        System.out.println("2. Thiết bị mạng");
        System.out.print("Chọn loại: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Mã tài sản: ");
        String code = sc.nextLine();

        System.out.print("Tên tài sản: ");
        String name = sc.nextLine();

        System.out.print("Giá mua: ");
        double price = sc.nextDouble();

        if (type == 1) {
            System.out.print("Dung lượng RAM (GB): ");
            int ram = sc.nextInt();
            assetList.add(new Computer(code, name, price, ram));
        } else if (type == 2) {
            System.out.print("Số cổng mạng: ");
            int ports = sc.nextInt();
            assetList.add(new NetworkDevice(code, name, price, ports));
        }
    }

    // 2. Xuất báo cáo
    static void showAll() {
        System.out.println("\n===== DANH SÁCH TÀI SẢN =====");
        for (Asset a : assetList) {
            a.showValue(); // Runtime Polymorphism
        }
    }

    // 3. Menu tìm kiếm
    static void searchMenu() {
        System.out.println("1. Tìm theo mã tài sản");
        System.out.println("2. Tìm theo giá mua");
        System.out.print("Chọn: ");
        int c = sc.nextInt();
        sc.nextLine();

        if (c == 1) {
            System.out.print("Nhập mã: ");
            search(sc.nextLine());
        } else if (c == 2) {
            System.out.print("Nhập giá mua: ");
            search(sc.nextDouble());
        }
    }

    // Overloading tìm kiếm
    static void search(String assetCode) {
        for (Asset a : assetList) {
            if (a.getAssetCode().equalsIgnoreCase(assetCode)) {
                a.showValue();
                return;
            }
        }
        System.out.println("Không tìm thấy tài sản!");
    }

    static void search(double price) {
        for (Asset a : assetList) {
            if (a.getPurchasePrice() == price) {
                a.showValue();
            }
        }
    }

    // 4. Sửa giá mua
    static void updatePrice() {
        sc.nextLine();
        System.out.print("Nhập mã tài sản: ");
        String code = sc.nextLine();

        for (Asset a : assetList) {
            if (a.getAssetCode().equalsIgnoreCase(code)) {
                System.out.print("Giá mới: ");
                a.setPurchasePrice(sc.nextDouble());
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy tài sản!");
    }
}
