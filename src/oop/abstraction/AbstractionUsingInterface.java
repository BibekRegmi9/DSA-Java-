package oop.abstraction;

  interface Animal{
    void makeSound();
}

 class Dog implements Animal{
     @Override
    public void makeSound(){
         System.out.println("Bark");
    }
}

class Cat implements Animal{
      @Override
    public void makeSound(){
          System.out.println("Meow");
      }
}

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}
