package myfirstproject;




public class Myfirstprogram {

	public static void main(String[] args) {
		System.out.println("This is my first program");
		int a = 5;
		int b = 10;
		System.out.println("Sum = " + (a + b));
	}

}

class Varma{
	public static void main(String[] args) {
		String V = "Varma";
		System.out.println("Hi " + V);
		
	}
}

class Student {
    int id;
    String name;
    int marks;

    void setDetails(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

class Hello {
    public static void main(String[] args) {
        // Create an object of Student
        Student s1 = new Student();

        // Assign values using the method
        s1.setDetails(101, "Durga", 95);

        // Display values using the method
        s1.displayDetails();
    }
}

