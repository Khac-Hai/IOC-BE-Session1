package session16.bai4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bánh mì", 50));
        products.add(new Product("Khoai tây chiên", 200));
        products.add(new Product("Nước ngọt", 30));

        ProductProcessor processor = new ProductProcessorImpl();

        // Kiểm tra sản phẩm > 100
        if (processor.hasExpensiveProduct(products)) {
            System.out.println("Có sản phẩm giá > 100.");
        } else {
            System.out.println("Không có sản phẩm giá tiền cao.");
        }

        // Tính tổng giá trị
        double total = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị sản phẩm: " + total);

        // In danh sách sản phẩm
        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);
    }
}
