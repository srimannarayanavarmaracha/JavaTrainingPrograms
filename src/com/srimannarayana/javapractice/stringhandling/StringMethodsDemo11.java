package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo11 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Methods ====================");
		
		System.out.println("\n============= Converting methods ==============");
		
		System.out.println("\n========= toCharArray() ==========");
		
		String greeting = "Hello";
		
		char[] letters = greeting.toCharArray();
		
		for (char c : letters) {
			System.out.println(c);
		}
		System.out.println("length of array : " + letters.length);
		
		String firstName = "Srimannarayana";
		String middleName = "Varma";
		String lastName = "Racha";
		
		char[] lettersInFirstName = firstName.toCharArray();
		char[] lettersInMiddleName = middleName.toCharArray();
		char[] lettersInLastName = lastName.toCharArray();
		
		System.out.println(firstName);
		
		for(char l : lettersInFirstName) {
			System.out.println(l);
		}
		
		System.out.println(middleName);
		
		for(char u : lettersInMiddleName) {
			System.out.println(u);
		}
		
		System.out.println(lastName);
		
		for(char i : lettersInLastName) {
			System.out.println(i);
		}
	}

}
