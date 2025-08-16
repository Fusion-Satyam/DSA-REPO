package oops;

public class Static_key {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "XYZ High School"; // setting static variable

    Student s2 = new Student();
    System.out.println("School Name: " + s2.schoolName); // accessing static variable
    
    }
    


}

class Student {
    String name;
    int age;

    static String schoolName ; // static variable

    void setName (String name) {
        this.name = name;
    }
    void getName() {
        System.out.println("Name: " + this.name);
    }

}
