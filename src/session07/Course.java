package session07;

public class Course {
    String code;
    String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public void showCourse() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Title: " + title);
    }
}

