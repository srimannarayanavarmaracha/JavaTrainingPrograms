package com.srimannarayana.javapractice.stringhandling;

public class StringComparison5 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Comparison ====================");

		System.out.println("\n========= compareTo() method ============");

		String first = "Apple";
		String second = "Apricot";
		String third = "Application";
		String fourth = "Apple";
		String fifth = "apple";
		
		System.out.println("first.compareTo(second) : " + first.compareTo(second));       
	    System.out.println("second.compareTo(first) : " + second.compareTo(first));       
		System.out.println("first.compareTo(third) : " + first.compareTo(third));        
		System.out.println("first.compareTo(fourth) : " + first.compareTo(fourth));
		System.out.println("first.compareTo(fifth) : " + first.compareTo(fifth));
		
		
		String course1 = "Java";
		String course2 = "JavaProgramming";
		String course3 = "Java";
		String course4 = "Jav";
		String course5 = "java";
		
		System.out.println("course1.compareTo(course1) : " + course1.compareTo(course1)); //0
		System.out.println("course1.compareTo(course2) : " + course1.compareTo(course2)); //-11 (prefix case)
		System.out.println("course1.compareTo(course3) : " + course1.compareTo(course3)); //0
		System.out.println("course1.compareTo(course4) : " + course1.compareTo(course4)); //1 (reverse prefix case)
		
		System.out.println("course2.compareTo(course1) : " + course2.compareTo(course1)); //11 (reverse prefix case)
		System.out.println("course2.compareTo(course2) : " + course2.compareTo(course2)); //0
		System.out.println("course2.compareTo(course3) : " + course2.compareTo(course3)); //11 (reverse prefix case)
		System.out.println("course2.compareTo(course4) : " + course2.compareTo(course4)); //12 (reverse prefix case)
		
		System.out.println("course3.compareTo(course1) : " + course3.compareTo(course1)); //0
		System.out.println("course3.compareTo(course2) : " + course3.compareTo(course2)); //-11 (prefix case)
		System.out.println("course3.compareTo(course3) : " + course3.compareTo(course3)); //0 
		System.out.println("course3.compareTo(course4) : " + course3.compareTo(course4)); //1 (reverse prefix case)
		
		System.out.println("course4.compareTo(course1) : " + course4.compareTo(course1)); //-1 (prefix case)
		System.out.println("course4.compareTo(course2) : " + course4.compareTo(course2)); //-12 (prefix case)
		System.out.println("course4.compareTo(course3) : " + course4.compareTo(course3)); //-1 (prefix case)
		System.out.println("course4.compareTo(course4) : " + course4.compareTo(course4)); //0
		
		
		System.out.println("\n========= compareToIgnoreCase() method ============");
		
		System.out.println("first.compareToIgnoreCase(fifth) : " + first.compareToIgnoreCase(fifth));
		System.out.println("fifth.compareToIgnoreCase(first) : " + fifth.compareToIgnoreCase(first));
		System.out.println("fourth.compareToIgnoreCase(fifth) : " + fourth.compareToIgnoreCase(fifth));
		System.out.println("fifth.compareToIgnoreCase(fourth) : " + fifth.compareToIgnoreCase(fourth));
		
		System.out.println("course1.compareToIgnoreCase(course5) : " + course1.compareToIgnoreCase(course5)); //0
		System.out.println("course5.compareToIgnoreCase(course1) : " + course5.compareToIgnoreCase(course1)); //0
		
		System.out.println("course2.compareToIgnoreCase(course5) : " + course2.compareToIgnoreCase(course5)); //11
		System.out.println("course5.compareToIgnoreCase(course2) : " + course5.compareToIgnoreCase(course2)); //-11
		
		System.out.println("course3.compareToIgnoreCase(course5) : " + course3.compareToIgnoreCase(course5)); //0
		System.out.println("course5.compareToIgnoreCase(course3) : " + course5.compareToIgnoreCase(course3)); //0
		
		System.out.println("course4.compareToIgnoreCase(course5) : " + course4.compareToIgnoreCase(course5)); //-1
		System.out.println("course5.compareToIgnoreCase(course4) : " + course5.compareToIgnoreCase(course4)); //1
		
		System.out.println("\n========= compareTo() with case difference ============");
		
		System.out.println("course1.compareTo(course5) : " + course1.compareTo(course5)); //-32
		System.out.println("course5.compareTo(course1) : " + course5.compareTo(course1)); //32
		
		System.out.println("course2.compareTo(course5) : " + course2.compareTo(course5)); //-32
		System.out.println("course5.compareTo(course2) : " + course5.compareTo(course2)); //32
		
		System.out.println("course3.compareTo(course5) : " + course3.compareTo(course5)); //-32
		System.out.println("course5.compareTo(course3) : " + course5.compareTo(course3)); //32
		
		System.out.println("course4.compareTo(course5) : " + course4.compareTo(course5)); //-32
		System.out.println("course5.compareTo(course4) : " + course5.compareTo(course4)); //32
		
	}

}
