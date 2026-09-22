package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo10 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Methods ====================");
		
		System.out.println("\n========= concat() method ============");
		
		String firstName = "Sri";
		String MiddleName = "Varma";
		String lastName = "Racha";
		

		String fullName = firstName.concat("mannarayana").concat(" ").concat(MiddleName).concat(" ").concat(lastName);
		
		System.out.println("fullName : " + fullName);
		
		String daughterFirstName = "Aadya";
		String daughterMiddleName = "Parmeshwari";
		String daughterLastName = "Devi";
		
		String daughterFullName = daughterFirstName.concat(" ").concat("Kalika").concat(" ").concat(daughterMiddleName).concat(" ").concat(daughterLastName);
		
		System.out.println("daughterFullName : " + daughterFullName);
	}

}
