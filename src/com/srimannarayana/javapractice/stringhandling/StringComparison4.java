package com.srimannarayana.javapractice.stringhandling;

public class StringComparison4 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Comparison ====================");

		System.out.println("\n========= compareTo() method ============");
		
		String name1 = "Kamakshi";
		String name2 = "kamakshi";
		String name3 = "Kamakhya";
		
		System.out.println("name1.compareTo(\"kamakshi\") : " + name1.compareTo("kamakshi"));
		
		System.out.println("name1.compareTo(name2) : " + name1.compareTo(name2));
		System.out.println("name2.compareTo(name1) : " + name2.compareTo(name1));
		
		System.out.println("name1.compareTo(\"Kamakhya\") : " + name1.compareTo("Kamakhya"));
		
		System.out.println("name1.compareTo(name3) : " + name1.compareTo(name3));
		System.out.println("name3.compareTo(name1) : " + name3.compareTo(name1));
		
		
		System.out.println("name1.compareTo(\"Kamakhya\") : " + name1.compareTo("Kamakhya"));
		System.out.println("name1.compareTo(name3) : " + name1.compareTo(name3));
		
		
		System.out.println("name3.compareTo(\"Kamakshi\") : " + name3.compareTo("Kamakshi"));
		System.out.println("name3.compareTo(name1) : " + name3.compareTo(name1));
		System.out.println("name3.compareTo(\"kamakhya\") : " + name3.compareTo("kamakhya"));
		System.out.println("(\"Kamakhya\").compareTo(\"kamakhya\") : " + ("Kamakhya").compareTo("kamakhya"));
		
		
	}

}
