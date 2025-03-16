package oop.oops.abstraction;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void makeSound();

    //abstract
    public abstract void eat();

    //concrete
    public void sleep(){
        System.out.println("zzz...");
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
