package oops;

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();

        Cat cat = new Cat();
        cat.eat();
        cat.walk();

        // Animal an = new Animal() {   // Cannot instantiate the abstract class Animal
            
        // };
        
    }
}

abstract class Animal {
   void eat(){
    System.out.println("Animal is eating.");
   }
    abstract void walk();
}

class Dog extends Animal {
    
    void walk() {
        System.out.println("Dog is walking.");
    }
}

class Cat extends Animal {
    
    void walk() {
        System.out.println("Cat is walking.");
    }
}
