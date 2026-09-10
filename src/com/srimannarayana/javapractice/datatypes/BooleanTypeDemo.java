package com.srimannarayana.javapractice.datatypes;

public class BooleanTypeDemo {

	public static void main(String[] args) {
		
		boolean isJavaFun = true;
		boolean isDatabaseDifficult = false;

		System.out.println(isJavaFun);
		System.out.println(isDatabaseDifficult);
		
		boolean isLoggedIn = true;
		boolean isAvailable = false;
		boolean isAdmin = true;
		boolean hasPaid = false;
		
		System.out.println(isLoggedIn);
		System.out.println(isAvailable);
		System.out.println(isAdmin);
		System.out.println(hasPaid);
		
		int age = 10;

		boolean isAdult = age >= 18;
		
		System.out.println(isAdult);
		
		int number = 10;

		System.out.println(number > 5);
		System.out.println(number < 5);
		System.out.println(number == 10);
		System.out.println(number != 10);
	}

}
