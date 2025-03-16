package oop.oops.abstraction;

public  class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }
}
