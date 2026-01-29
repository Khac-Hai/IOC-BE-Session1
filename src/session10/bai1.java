package session10;

class Animal1 {
    protected String name;

    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        this.name = name;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Dog1 d = new Dog1("Buddy");
        d.makeSound();
    }
}
