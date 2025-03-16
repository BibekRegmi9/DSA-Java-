package oop.oops.polymorphism.runtime;

public class Animal {
    private String name;
    private int age;

    public void fart(){
        System.out.println("Animal farts");
    }

    public void eat(){
        System.out.println("Eats food");
    }

    public void makeSound(){
        System.out.println("making sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
