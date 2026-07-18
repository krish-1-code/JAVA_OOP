package JAVA_OOP;


// Abstract class
abstract class Animal {

    // Regular method
    void eat() {
        System.out.println("This animal is eating.");
    }

    // Abstract method (no body)
    abstract void makeSound();
}

// Child class
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Another child class
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class J6_Abstraction {
     public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.makeSound();

        System.out.println();

        cat.eat();
        cat.makeSound();
    }
}
    

