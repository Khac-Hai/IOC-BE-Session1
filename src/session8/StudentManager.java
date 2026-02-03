package session8;

public class StudentManager {
    private Student[] students;
    private int size;
    private static final int MaxSize = 100;
    public StudentManager() {
        students = new Student[MaxSize];
        size = 0;
    }

}
