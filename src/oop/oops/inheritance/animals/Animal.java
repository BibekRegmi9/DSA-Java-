package oop.oops.inheritance.animals;

public class Animal {
    private String name;
    private int age;

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
