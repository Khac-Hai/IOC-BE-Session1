package session07;

public class oop1 {
    String name;
    String studenId;
    String email;
    String phone;
    String date;
    sex sex;
    public oop1(String id) {
        studenId = id;
    }
    public oop1() {

    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void drink() {
        System.out.println(name + " is drinking");
    }
    public void talk() {
        System.out.println(name + " is talking");
    }
    public void doHomework() {
        System.out.println(name + " is homeworking");
    }
    public void attendClass(){
        System.out.println(name + " is attending");
    }

    public static void main(String[] args) {
        oop1 o = new oop1();
        o.name = "Jack";
        o.eat();
    }

}
