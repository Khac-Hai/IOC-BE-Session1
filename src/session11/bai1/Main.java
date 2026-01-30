package session11.bai1;

import session11.bai1.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Rectangle", 5, 3);
        shapes[1] = new Circle("Circle", 4);

        for (Shape shape : shapes) {
            shape.displayInfo();
            if  (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }
            System.out.println("-------------------");
        }
    }
}
