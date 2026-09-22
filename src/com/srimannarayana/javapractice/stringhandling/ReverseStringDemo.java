package com.srimannarayana.javapractice.stringhandling;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String firstName = "Srimannarayana";
		String middleName = "Varma";
		String lastName = "Racha";
		
		char[] firstLetters = firstName.toCharArray();
		char[] middleLetters = middleName.toCharArray();
		char[] lastLetters = lastName.toCharArray();
		
		System.out.println("\nfirstName : " + firstName);
		System.out.print("Reversed firstName : ");
		
		for (int i = firstLetters.length - 1; i >= 0; i--) {
			System.out.print(firstLetters[i]);
		}
		
		System.out.println("\nmiddleName : " + middleName);
		System.out.print("Reversed middleName : ");
		
		for (int i = middleLetters.length - 1; i >= 0; i--) {
			System.out.print(middleLetters[i]);
		}
		
		System.out.println("\nlastName : " + lastName);
		System.out.print("Reversed lastName : ");
		
		for (int i = lastLetters.length - 1; i >= 0; i--) {
			System.out.print(lastLetters[i]);
		}
	}

}
