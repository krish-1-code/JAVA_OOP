package JAVA_OOP;

// Parent class
class Animal {

    String type = "Animal";

    Animal(String name) {
        System.out.println("Animal constructor called.");
        System.out.println("Animal name: " + name);
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {

    String type = "Dog";

    Dog(String name) {
        super(name);   // Calls Animal's constructor
        System.out.println("Dog constructor called.");
    }

    void display() {

        // Current class variable
        System.out.println("Child type: " + this.type);

        // Parent class variable
        System.out.println("Parent type: " + super.type);

        // Calling parent method
        super.makeSound();

        // Child's own message
        System.out.println("Dog barks: Woof!");
    }
}

// Main class
public class J5_Super {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");

        System.out.println();

        dog.display();
    }
}