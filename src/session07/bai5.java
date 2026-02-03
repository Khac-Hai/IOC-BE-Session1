package session07;

public class bai5 {
    public class Course {
        public String code;
        public String title;

        public void showCourse() {
            System.out.println("Course: " + code + " - " + title);
        }
    }

    public class Student {
        public int id;
        public String name;
        public Course course;

        public void displayInfo() {
            System.out.println("Student: " + id + " - " + name);
            if (course != null) {
                course.showCourse();
            }
        }
    }

}
