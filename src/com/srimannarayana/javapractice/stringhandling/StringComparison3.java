package com.srimannarayana.javapractice.stringhandling;

public class StringComparison3 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Comparison ====================");

		System.out.println("\n========= compareTo() method ============");
		
		String name1 = "Kamakshi Devi";
		String name2 = "Lalitha Devi";
		String name3 = "Durga Devi";
		
		System.out.println("name1.compareTo(\"Durga Devi\") : " + name1.compareTo("Durga Devi"));
		System.out.println("name1.compareTo(name3) : " + name1.compareTo(name3));
		System.out.println("name1.compareTo(\"Kamakshi Devi\") : " + name1.compareTo("Kamakshi Devi"));
		System.out.println("name1.compareTo(name1) : " + name1.compareTo(name1));
		System.out.println("name1.compareTo(\"Lalitha Devi\") : " + name1.compareTo("Lalitha Devi"));
		System.out.println("name1.compareTo(name2) : " + name1.compareTo(name2));
		

		System.out.println("name2.compareTo(\"Kamakshi Devi\") : " + name2.compareTo("Kamakshi Devi"));
		System.out.println("name2.compareTo(name1) : " + name2.compareTo(name1));
		System.out.println("name2.compareTo(\"Lalitha Devi\") : " + name2.compareTo("Lalitha Devi"));
		System.out.println("name2.compareTo(name2) : " + name2.compareTo(name2));
		System.out.println("name2.compareTo(\"Durga Devi\") : " + name2.compareTo("Durga Devi"));
		System.out.println("name2.compareTo(name3) : " + name2.compareTo(name3));
		
		
		System.out.println("name3.compareTo(\"Lalitha Devi\") : " + name3.compareTo("Lalitha Devi"));
		System.out.println("name3.compareTo(name2) : " + name3.compareTo(name2));
		System.out.println("name3.compareTo(\"Durga Devi\") : " + name3.compareTo("Durga Devi"));
		System.out.println("name3.compareTo(name3) : " + name3.compareTo(name3));
		System.out.println("name3.compareTo(\"Kamakshi Devi\") : " + name3.compareTo("Kamakshi Devi"));
		System.out.println("name3.compareTo(name1) : " + name3.compareTo(name1));
		
	}

}
