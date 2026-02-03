package session08;

public class bai1 {
    private int id;
    private String name;
    private int age;

    public bai1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        bai1 student1 = new bai1(1, "Nguyen Van A", 20);
        student1.printInfo();
    }
}
