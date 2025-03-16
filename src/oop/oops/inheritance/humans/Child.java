package oop.oops.inheritance.humans;

public class Child extends Parent{
    public Child(){
        System.out.println("Child constructor called");
    }

    //super
    public void childMethod(){
        super.parentMethod();
        System.out.println("Child method called");
    }
}
