package oop.oops.constructors;

public class Student {
    private int id;
    private String name;
    private int age;

    // custom constructor
    public Student(){
        this.age = 20;
    }

    // paramatrized contrructor
    public Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
