package session09;

public class bai3 {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyễn Văn A", 20, 3.5);
        Student s2 = new Student("SV002", "Trần Thị B", 21, 3.8);
        Student s3 = new Student("SV003", "Lê Văn C", 19, 3.2);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        System.out.println("Tổng số sinh viên đã tạo: " + Student.getCount());
    }
}

class Student {
    private String id;
    private String fullName;
    private int age;
    private double gpa;

    private static int count = 0;
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;

    public Student(String id, String fullName, int age, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void printInfo() {
        System.out.printf("ID: %s, Name: %s, Age: %d, GPA: %.2f%n", id, fullName, age, gpa);
    }
}
