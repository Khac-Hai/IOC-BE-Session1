package session07;

public class main {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Introduction to Programming");
        Student student = new Student(1, "Nguyen Van A", course);

        student.displayInfo();

    }
}

