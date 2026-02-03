package session07;

import java.util.ArrayList;
import java.util.List;

public class bai2 {
    public class Product {
        private String id;
        private String name;
        private double price;

        public String getInfo() {
            return "Product[id=" + id + ", name=" + name + ", price=" + price + "]";
        }

        // getters & setters
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

    public class Category {
        private String id;
        private String name;
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product p) {
            products.add(p);
        }

        public void removeProduct(Product p) {
            products.remove(p);
        }

        public List<Product> getProducts() {
            return products;
        }

        public String getInfo() {
            return "Category[id=" + id + ", name=" + name + ", totalProducts=" + products.size() + "]";
        }
    }

}
