package session10.BT3;

public class Main {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();

        double price1 = mt.calculatePrice(1000.0);
        System.out.println("Final Price = " + price1);

        double price2 = mt.calculatePrice(1000.0, 100.0);
        System.out.println("Final Price = " + price2);

        double price3 = mt.calculatePrice(1000.0, 100.0, 50.0);
        System.out.println("Final Price = " + price3);
    }
}
