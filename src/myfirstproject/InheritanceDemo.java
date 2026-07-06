package myfirstproject;

// Parent class
class Person {

    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Child class
class Student extends Person {

    int rollNo;

    // Constructor
    Student(String name, int age, int rollNo) {
        super(name, age); // Calls the parent class constructor
        this.rollNo = rollNo;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Roll No : " + rollNo);
    }
}

// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        Student s = new Student("Ravi Kumar", 20, 101);

        System.out.println("Person Details");
        s.displayDetails();

        System.out.println("\nStudent Details");
        s.displayStudentInfo();
    }
}