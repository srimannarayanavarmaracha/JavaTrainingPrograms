package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo9 {

	public static void main(String[] args) {
		
		System.out.println("\n========== intern() Block ==========");
		
		String poolString = "Java";
		String newString = new String("Java");
		
		System.out.println("poolString == newString : " + (poolString == newString));
		
		String internedString = newString.intern();
		
		System.out.println("poolString == internedString : " + (poolString == internedString));
		
		System.out.println("newString == internedString : " + (newString == internedString));
		
		System.out.println("poolString.equals(internedString) : " + (poolString.equals(internedString)));
		
		System.out.println("newString.equals(internedString) : " + (newString.equals(internedString)));
		
		System.out.println("poolString.equals(newString) : " + (poolString.equals(newString)));
		
	}

}
