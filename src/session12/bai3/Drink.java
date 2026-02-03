package session12.bai3;

public abstract class Drink implements IPromotion {
    protected int id;
    protected String name;
    protected double price;

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void applyDiscount(double percentage) {
        price = price - price * percentage / 100;
    }

    public abstract void prepare();

    public void display() {
        System.out.println("ID: " + id +
                " | Tên: " + name +
                " | Giá: " + price);
        prepare();
    }
}
