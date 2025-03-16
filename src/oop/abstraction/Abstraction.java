package oop.abstraction;

abstract class Vechicle{
    abstract void start();

    void stop(){
        System.out.println("Vechicle stopped");
    }

    abstract String repair();

}

class Car extends Vechicle{

    @Override
    void start(){
        System.out.println("Car starts");
    }

    @Override
    String repair(){
        String str = "repairing car";
        return str;
    }
}

class Bike extends Vechicle{
    @Override
    void start(){
        System.out.println("Bike starts");
    }

    @Override
    String repair(){
        return "repairing bike";
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Vechicle myCar = new Car();
        myCar.start();
        myCar.repair();

        Vechicle bike = new Bike();
        bike.start();
    }

}
