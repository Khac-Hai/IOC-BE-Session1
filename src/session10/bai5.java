package session10;

// Lớp cha Animal
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void makeSound(String sound) {
        System.out.println(name + " says: " + sound);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
}

// Lớp Mammal kế thừa Animal
class Mammal extends Animal {
    private boolean hasHair;

    public Mammal(String name, int age, boolean hasHair) {
        super(name, age);
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Has hair: " + hasHair);
    }
}

// Lớp Dog kế thừa Mammal
class Dog extends Mammal {
    public Dog(String name, int age, boolean hasHair) {
        super(name, age, hasHair);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof!");
    }

    public void fetchBall() {
        System.out.println(name + " is fetching the ball.");
    }
}

// Lớp Cat kế thừa Mammal
class Cat extends Mammal {
    public Cat(String name, int age, boolean hasHair) {
        super(name, age, hasHair);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }

    public void climbTree() {
        System.out.println(name + " is climbing the tree.");
    }
}

// Lớp Elephant kế thừa Mammal
class Elephant extends Mammal {
    public Elephant(String name, int age, boolean hasHair) {
        super(name, age, hasHair);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets: Pawoo!");
    }

    public void sprayWater() {
        System.out.println(name + " is spraying water.");
    }
}

// Lớp chính ZooApp
public class bai5 {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Dog("Buddy", 3, true),
                new Cat("Whiskers", 2, true),
                new Elephant("Dumbo", 10, false)
        };

        for (Animal animal : zoo) {
            animal.makeSound(); // runtime polymorphism
            animal.eat();
            animal.makeSound("Hello!");
            animal.eat("grass");

            if (animal instanceof Dog) {
                ((Dog) animal).fetchBall();
            } else if (animal instanceof Cat) {
                ((Cat) animal).climbTree();
            } else if (animal instanceof Elephant) {
                ((Elephant) animal).sprayWater();
            }

            System.out.println();
        }
    }
}
