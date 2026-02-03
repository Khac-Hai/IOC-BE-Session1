package session10.BT4;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.speed();
        myCar.printStatus();

        myCar.speed(20);
        myCar.printStatus();

        myCar.speed(20, 1);
        myCar.printStatus();
    }
}
