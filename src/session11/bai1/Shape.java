package session11.bai1;

public abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public void displayInfo(){
        System.out.println("Hình: " + name);
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
    }
}


