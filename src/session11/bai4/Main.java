package session11.bai4;

public class Main {
    public static void main(String[] args) {
        Device[] devices = {
                new SmartPhone(1, "iPhone"),
                new Laptop(2, "Dell"),
                new Television(3, "Samsung TV")
        };

        for (Device d : devices) {
            d.turnOn();

            if (d instanceof Connectable) {
                ((Connectable) d).connectWifi();
            }

            if (d instanceof Chargeable) {
                ((Chargeable) d).charge();
            }

            d.turnOff();
            System.out.println("----------------------");
        }
    }
}
