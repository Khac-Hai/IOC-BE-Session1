package session09;

public class bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);

        // In thông tin hình chữ nhật
        rect.printInfo();

        // Tính và in diện tích và chu vi
        System.out.println("Diện tích: " + rect.getArea());
        System.out.println("Chu vi: " + rect.getPerimeter());
    }
}

// Lớp Rectangle
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printInfo() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
    }
}
