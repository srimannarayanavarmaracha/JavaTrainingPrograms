package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo12 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Methods ====================");
		
		System.out.println("\n============= Converting methods ==============");
		
		System.out.println("\n========= valueOf()==========");
		
		char[] myCharArray = {'J', 'a', 'v', 'a', ' ', 'P', 'r', 'o', 'g', 'r', 'm', 'm', 'i', 'n', 'g'};
		String convertedString = String.valueOf(myCharArray);
		System.out.println("From char array : " + convertedString);
		
		char [] nameArray = {'S', 'h', 'y', 'a', 'm', ' ', 'S', 'u', 'n', 'd', 'h', 'o', 'r', 'i' };
		String convertedName = String.valueOf(nameArray);
		System.out.println("From char nameArray : " + convertedName);
		
		int age = 25;
		String ageString = String.valueOf(age);
		System.out.println("From int (age + 5) : " + (ageString + 5));
		
		System.out.println("30" + 20);
		
		boolean isJavaFun = true;
		String boolString = String.valueOf(isJavaFun);
		System.out.println("From boolean : " + boolString);
		
		boolean isItNight = false ;
		String boolNightString = String.valueOf(isItNight);
		System.out.println("From boolean isItNight : " + boolNightString);
		
		System.out.println("This is " + boolNightString);
		
		System.out.println("This is " + boolString);
		System.out.println("It is " + false);
		System.out.println("It is " + true);
	}

}
