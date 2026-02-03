package session07;

public class bai6 {
    public class Customer {
        public int id;
        public String name;
        public String email;

        public void showInfo() {
            System.out.println("Customer: " + id + " - " + name + ", email: " + email);
        }
    }

    public class Order {
        public int orderId;
        public Customer customer;
        public double total;

        public void printOrder() {
            System.out.println("Order: " + orderId + ", total: " + total);
            if (customer != null) {
                customer.showInfo();
            }
        }
    }

}
