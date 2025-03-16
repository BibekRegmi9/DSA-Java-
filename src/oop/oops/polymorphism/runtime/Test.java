package oop.oops.polymorphism.runtime;

public class Test {
    public static void main(String[] args) {

        //method overriding
        Dog dog = new Dog();
        dog.fart();

        // run time polymorphism/ runtime method overriding
        Animal animal = new Dog();
        animal.fart();
    }
}
