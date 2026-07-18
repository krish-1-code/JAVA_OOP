package JAVA_OOP;

// Parent class (Superclass)
class Animal {

    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass)
class Dog extends Animal {

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class
public class J4_Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Buddy";

        // Inherited methods
        dog.eat();
        dog.sleep();

        // Dog's own method
        dog.bark();
    }
}
