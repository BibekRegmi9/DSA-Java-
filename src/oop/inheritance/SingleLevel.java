package oop.inheritance;

class Animal{
    void makeSound(){
        System.out.println("Animal make sound");
    }
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void barking(){
        System.out.println("Dog is barking");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.barking();

    }
}
