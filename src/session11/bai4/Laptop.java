package session11.bai4;

public class Laptop extends Device implements Connectable, Chargeable {
    public Laptop(int id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " laptop is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " laptop is turned off.");
    }

    @Override
    public void connectWifi() {
        System.out.println(name + " laptop connected to WiFi.");
    }

    @Override
    public void charge() {
        System.out.println(name + " laptop is charging.");
    }
}
