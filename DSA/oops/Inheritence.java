package oops;

public class Inheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();
        dog.eat();
        dog.bark();

      
    }
}

class Animal {
    String name;
    
    void breathe(){
        System.out.println(" is breathing.");
    }
    
    
    void eat() {
        System.out.println(" is eating.");
    }
}

class Dog extends Animal {
    

    void bark() {
        System.out.println( " is barking.");
    }
}