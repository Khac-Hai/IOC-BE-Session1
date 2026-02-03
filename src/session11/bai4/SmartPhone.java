package session11.bai4;

public class SmartPhone extends Device implements Connectable, Chargeable {
    public SmartPhone(int id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " smartphone is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " smartphone is turned off.");
    }

    @Override
    public void connectWifi() {
        System.out.println(name + " smartphone connected to WiFi.");
    }

    @Override
    public void charge() {
        System.out.println(name + " smartphone is charging.");
    }
}
