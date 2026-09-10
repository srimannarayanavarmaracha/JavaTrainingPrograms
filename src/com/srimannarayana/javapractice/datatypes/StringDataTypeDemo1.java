package com.srimannarayana.javapractice.datatypes;

import java.util.Scanner;

public class StringDataTypeDemo1 {

	public static void main(String[] args) {
		
		String name = "Srimannarayana";
		String city = "Hyderabad";
		String course = "Java";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name : ");
		String first_name = sc.nextLine();
		
		System.out.println("Enter your last name : ");
		String last_name = sc.nextLine();
		
		String full_name = first_name + " " + last_name;
		
		
		System.out.println("Enter your city name : ");
		String city_name = sc.nextLine();
		
		
		System.out.println("Enter your Course name : ");
		String course_name = sc.nextLine();
		
		
		System.out.println("Name : " + name);
		System.out.println("Name Length = " + name.length());

		
		System.out.println("City : " + city);
		System.out.println("City (String Length) : " + city.length());
	    
		
		System.out.println("Course : " + course);
		System.out.println("Course (String Length) : " + course.length());
		
		
		System.out.println("Full Name : " + full_name);
		System.out.println("First Name Length = " + first_name.length());
		System.out.println("Last Name Length = " + last_name.length());
		System.out.println("Full Name Length = " + full_name.length());
		
		
		System.out.println("City : " + city_name);
		System.out.println("City Name Length : " + city_name.length());
		
		
		System.out.println("Course Name : " + course_name);
		System.out.println("Course Name Length : " + course_name.length());
		
		
		sc.close();
		
	}

}
