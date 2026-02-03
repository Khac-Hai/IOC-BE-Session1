package session10;

class Shape {
    public double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class bai2 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2, 3);
        Shape s2 = new Circle(1);

        System.out.println("Rectangle area: " + s1.area());
        System.out.println("Circle area: " + s2.area());
    }
}
