package com.srimannarayana.javapractice.stringhandling;

public class StringImmutabilityDemo1 {

	public static void main(String[] args) {
		
		String name = "Java";
		System.out.println("Before : " + name);
		name.concat(" Programming");
		System.out.println("After : " + name);
		
		name = name.concat(" Programming");
		System.out.println("After assigning it to (name) : " + name);
		

	}

}
