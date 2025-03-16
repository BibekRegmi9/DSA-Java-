package oop.oops.inheritance.humans;

public class GrandParent {
    private String name;
    private int age;

    public GrandParent(){
        System.out.println("Grandparent constructor called");
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
