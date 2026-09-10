package com.srimannarayana.javapractice.datatypes;

public class StringCreationDemo {

	public static void main(String[] args) {
		
		String name = "Java";
		
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println("Name : " + name);
		
		System.out.println("First Name : " + firstName);
		
		System.out.println("Last Name : " + lastName);
		
		String nameUsingNew = new String("Java");
		
		System.out.println("Name Using new : " + nameUsingNew);
		
		System.out.println("name == nameUsingNew : " + name == nameUsingNew);
		
		System.out.println("name.equals(nameUsingNew) : " + name.equals(nameUsingNew));
		
		String name1 = "Java";
		String name2 = "Java";

		System.out.println("name1 == name2 : " + name1 == name2);
		System.out.println("name1.equals(name2) : " + name1.equals(name2));
		
		String name3 = "Java";
		String name4 = new String("Java");
		
        System.out.println("name3 == name4 : " + name3 == name4);
		System.out.println("name3.equals(name4) : " + name3.equals(name4));
		
		String course1 = "Java";
		String course2 = "Java";
		
		System.out.println("course1 == course2 : " + course1 == course2);
		System.out.println("course1.equals(course2) : " + course1.equals(course2));
		
		String course3 = "Python";
		
		String course4 = new String("Python");
		
		System.out.println("course3 == course4 : " + course3 == course4);
		System.out.println("course3.equals(course4) : " + course3.equals(course4));
		
		System.out.println("course4 == course3 : " + course4 == course3);
		System.out.println("course4.equals(course3) : " + course4.equals(course3));
		
	}

}
