package session16.bai4;

import java.util.List;

public interface ProductProcessor {
    // Phương thức trừu tượng
    double calculateTotalValue(List<Product> products);

    // Phương thức mặc định
    default boolean hasExpensiveProduct(List<Product> products) {
        return products.stream().anyMatch(p -> p.getPrice() > 100);
    }

    // Phương thức tĩnh
    static void printProductList(List<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

