package session10.BT4;

public class Car {
    private int currentSpeed = 0;

    public void speed() {
        currentSpeed += 10;
        System.out.println("Mặc định ô tô tăng tốc: +10 km/h");
    }

    public void speed(int speed) {
        currentSpeed = speed;
        System.out.println("Ôtô tăng tốc bằng " + speed + " km/h");
    }

    public void speed(int speed, int time) {
        int increase = speed * time;
        currentSpeed += increase;
        System.out.println("Ôtô tăng tốc " + increase + " km/h (tốc độ x thời gian)");
    }

    public void printStatus() {
        System.out.println("Tốc độ hiện tại: " + currentSpeed + " km/h");
    }
}

