package session08;

public class bai4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        Rectangle maxRect = r1;
        if (r2.getArea() > maxRect.getArea()) {
            maxRect = r2;
        } else if (r2.getArea() == maxRect.getArea()) {
            System.out.println("Có ít nhất hai hình có diện tích bằng nhau.");
        }

        if (r3.getArea() > maxRect.getArea()) {
            maxRect = r3;
        } else if (r3.getArea() == maxRect.getArea()) {
            System.out.println("Có ít nhất hai hình có diện tích bằng nhau.");
        }

        System.out.println("Hình có diện tích lớn nhất:");
        System.out.println(maxRect);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle(width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f)",
                width, height, getArea(), getPerimeter());
    }
}
