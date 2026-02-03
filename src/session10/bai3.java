package session10;

class Computer {
    double calculatePrice(double basePrice) {
        System.out.println("Using base price only");
        return basePrice;
    }

    double calculatePrice(double basePrice, double tax) {
        System.out.println("Using base price + tax");
        return basePrice + tax;
    }

    double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("Using base price + tax - discount");
        return basePrice + tax - discount;
    }
}

public class bai3 {
    public static void main(String[] args) {
        Computer c = new Computer();

        System.out.println("Price 1: " + c.calculatePrice(1000));
        System.out.println("Price 2: " + c.calculatePrice(1000, 100));
        System.out.println("Price 3: " + c.calculatePrice(1000, 100, 50));
    }
}
