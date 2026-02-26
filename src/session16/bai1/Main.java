package session16.bai1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService service = new ProductService();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // bỏ dòng thừa
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> editProduct();
                case 3 -> deleteProduct();
                case 4 -> service.displayProducts();
                case 5 -> service.filterProducts();
                case 6 -> service.totalValue();
                case 0 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- Product Management System ---");
        System.out.println("1. Add Product");
        System.out.println("2. Edit Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Display Products");
        System.out.println("5. Filter Products (Price > 100)");
        System.out.println("6. Total Value of Products");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        service.addProduct(id, name, price);
    }

    private static void editProduct() {
        System.out.print("Enter Product ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Product Price: ");
        double price = scanner.nextDouble();
        service.editProduct(id, name, price);
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = scanner.nextInt();
        service.deleteProduct(id);
    }
}

