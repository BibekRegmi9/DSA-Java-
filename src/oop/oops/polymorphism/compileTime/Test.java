package oop.oops.polymorphism.compileTime;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,1));
        System.out.println(calculator.add(1,1, 1));
    }
}
