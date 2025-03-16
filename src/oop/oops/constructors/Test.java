package oop.oops.constructors;

public class Test {
    public static void main(String[] args) {
        // default constructor
        Student student = new Student();

        //custom constructor
        Student student1 = new Student();
        System.out.println(student1.getAge());

        //parametized constructor
        Student student2 = new Student("Bibek", 24, 07);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getId());
    }
}
