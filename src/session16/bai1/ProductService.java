package session16.bai1;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(int id, String name, double price) {
        products.put(id, new Product(id, name, price));
        System.out.println("Product added successfully.");
    }

    public void editProduct(int id, String newName, double newPrice) {
        if (products.containsKey(id)) {
            Product p = products.get(id);
            p.setName(newName);
            p.setPrice(newPrice);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (products.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            products.values().forEach(System.out::println);
        }
    }

    public void filterProducts() {
        List<Product> filtered = products.values().stream()
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
        if (filtered.isEmpty()) {
            System.out.println("No products match the filter.");
        } else {
            filtered.forEach(System.out::println);
        }
    }

    public void totalValue() {
        double total = products.values().stream()
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println("Total value of products: " + total);
    }
}

