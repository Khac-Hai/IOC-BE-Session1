package session08;

import java.util.ArrayList;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        int choice;

        do {
            System.out.println("===== MENU SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. In danh sách sản phẩm");
            System.out.println("3. Tìm sản phẩm theo khoảng giá");
            System.out.println("4. Thống kê số sản phẩm đã tạo");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    products.add(new Product(name, price));
                    break;
                case 2:
                    System.out.println("=== Danh sách sản phẩm ===");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.print("Nhập giá thấp nhất: ");
                    double min = scanner.nextDouble();
                    System.out.print("Nhập giá cao nhất: ");
                    double max = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Sản phẩm trong khoảng giá:");
                    for (Product p : products) {
                        if (p.getPrice() >= min && p.getPrice() <= max) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tổng số sản phẩm đã tạo: " + Product.getCount());
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

class Product {
    private static int nextId = 1;
    private static int count = 0;
    public static final String WAREHOUSE_CODE = "KHO-01";

    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
        count++;
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Warehouse: %s", id, name, price, WAREHOUSE_CODE);
    }
}
