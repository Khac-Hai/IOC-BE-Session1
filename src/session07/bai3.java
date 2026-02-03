package session07;

public class bai3 {
    public class Animal {
        protected String name;
        protected int age;

        public void makeSound() {
            System.out.println("Animal sound...");
        }
    }

    public class Dog extends Animal {
        private String color;

        public void bark() {
            System.out.println("Woof woof!");
        }
    }

    public class Cat extends Animal {
        private String breed;

        public void meow() {
            System.out.println("Meow meow!");
        }
    }

}
