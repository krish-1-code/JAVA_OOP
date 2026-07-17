package JAVA_OOP;

//Two main elements of OOP are Classes and Objects;

//Classes: A blueprint for creating objects;
//Objects : Instance of a class

//In A CLASS there's two main elements: Attributes and Methods

// Attrbutes are the properties {variables} while methods are like the function inside a class

//Constructor: A constructor is a special type of methods which is used to intialize objects;

class Animals{

    String name;
    double height_cm;

    Animals(String name, double height_cm){
        this.name = name;
        this.height_cm = height_cm;
    }

}

public class J1_IntroToOOPS {

    public static void main(String[] args){
    Animals animal1 = new Animals("Dog", 89);
    Animals animal2 = new Animals("Cat", 45);

    System.out.println("First Animal Name : " + animal1.name);
    System.out.println("First Animal Height : " + animal1.height_cm);
    System.out.println("Second Animal Name : " + animal2.name);
    System.out.println("First Animal Height : " + animal2.height_cm);


    
    }
}
