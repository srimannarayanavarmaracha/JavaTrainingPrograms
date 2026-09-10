package com.srimannarayana.javapractice.datatypes;

public class CharacterInterviewDemo {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		if(Character.isUpperCase(ch)) {
			System.out.println(ch + " is an uppercase letter");
			
		} else if(Character.isLowerCase(ch)) {
			System.out.println(ch + " is an lower case letter");
		
		} else if (Character.isDigit(ch)) {
			System.out.println(ch + " is an digit");
				
		} else {
			System.out.println(ch + " is an Special character");
		}
		
	}

}