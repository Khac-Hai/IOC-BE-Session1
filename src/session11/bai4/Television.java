package session11.bai4;

public class Television extends Device implements Connectable {
    public Television(int id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " television is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " television is turned off.");
    }

    @Override
    public void connectWifi() {
        System.out.println(name + " television connected to WiFi.");
    }
}