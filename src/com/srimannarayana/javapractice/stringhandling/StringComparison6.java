package com.srimannarayana.javapractice.stringhandling;

public class StringComparison6 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Comparison ====================");
		
		String first = "Kamakshi";
		String second = "Kamaksha";
		String third = "Kamakshi";
		String fourth = "kamakshi";
		
		System.out.println("first.compareTo(second) : " + first.compareTo(second)); //positive
		System.out.println("second.compareTo(first) : " + second.compareTo(first)); //negative 
		System.out.println("first.compareTo(third) : " + first.compareTo(third)); //0
		System.out.println("first.compareTo(fourth) : " + first.compareTo(fourth)); //negative
		System.out.println("fourth.compareTo(first) : " + fourth.compareTo(first)); //positive
		
		char letter1 = 'K';
		char letter2 = 'k';
		
		System.out.println("letter1 : " + (int)letter1);
		System.out.println("letter2 : " + (int)letter2);
	
	}

}
