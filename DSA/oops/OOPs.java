package oops;

public class OOPs {
    public static void main(String[] args) {


        
        Student s1 = new Student();
        Student s2 = new Student("Satyam");
        Student s3 = new Student("Satyam", 25);
}
}

class Student{
    String name;
    int age;

    // Constructor Overloading
     Student() {                        // no-arg constructor
        System.out.println("Default constructor");
    }
    Student(String name){               // one-arg constructor
        this.name=name;
        System.out.println("Name "+ name);
    }
    Student (String name,int age){      //two -arg constructor
        this.name=name;
        this.age = age;
        System.out.println("Name "+ name +" Age "+age);

    }
    
}
