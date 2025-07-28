package oop;

public class SingletonClassExample {

    private static SingletonClassExample instance;


    //private static instance of the SingletonClassExample
    private SingletonClassExample(){
        //constructor is private so that no one can create an instance of the class
        System.out.println("SingletonClassExample instance is created");
    }

    // Public static method to get the single instance of the class
    public static SingletonClassExample getInstance(){
        if(instance == null){
            instance = new SingletonClassExample();
        }
        return instance;
    }

    public String getSetting(String key) {
        // In a real application, this would retrieve a specific setting like database connection url
        return "Value for " + key;
    }

    public static void main(String[] args) {
        SingletonClassExample instance1 = SingletonClassExample.getInstance();
        System.out.println(instance1.getSetting("database connection url"));
    }
}
