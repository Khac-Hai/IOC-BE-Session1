package session07;

public class Student {
    int id;
    String name;
    Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        if (course != null) {
            course.showCourse();
        } else {
            System.out.println("No course registered.");
        }
    }
}

