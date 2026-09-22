package com.srimannarayana.javapractice.stringhandling;

public class StringComparision1 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Comparison ====================");

		System.out.println("\n========= equals() method ============");

		String first = "Java";
		String second = "Java";
		String third = "java";

		System.out.println("first.equals(second) : " + first.equals(second));
		System.out.println("first.equals(third) : " + first.equals(third));
		
		String firstGroup = "First Group";
		
		String name1 = "Vishalakshi";
		String name2 = "Vishalakshi";
		String name3 = " Vishalakshi";
		String name4 = "Vishalakshi ";
		String name5 = " Vishalakshi";
		String name6 = "Vishalakshi ";
		
		String secondGroup = "Second Group";
		
		String name7 = "vishalakshi";
		String name8 = "vishalakshi";
		String name9 = " vishalakshi";
		String name10 = "vishalakshi ";
		String name11 = " vishalakshi";
		String name12 = "vishalakshi ";
		
		System.out.println("\n==========[" + firstGroup + "]==========");
		
		System.out.println("name1.equals(name2) : " + name1.equals(name2));
		System.out.println("name2.equals(name1) : " + name2.equals(name1));
		
		System.out.println("name1.equals(name3) : " + name1.equals(name3));
		System.out.println("name3.equals(name1) : " + name3.equals(name1));
		
		System.out.println("name2.equals(name3) : " + name2.equals(name3));
		System.out.println("name3.equals(name2) : " + name3.equals(name2));
		
		System.out.println("name3.equals(name4) : " + name3.equals(name4));
		System.out.println("name4.equals(name3) : " + name4.equals(name3));
		
		System.out.println("name4.equals(name5) : " + name4.equals(name5));
		System.out.println("name5.equals(name4) : " + name5.equals(name4));
		
		System.out.println("name5.equals(name6) : " + name5.equals(name6));
		System.out.println("name6.equals(name5) : " + name6.equals(name5));
		
		System.out.println("name3.equals(name5) : " + name3.equals(name5));
		System.out.println("name5.equals(name3) : " + name5.equals(name3));
		
		System.out.println("name4.equals(name6) : " + name4.equals(name6));
		System.out.println("name6.equals(name4) : " + name6.equals(name4));
		
		System.out.println("\n===[" + firstGroup + "]equals["+ secondGroup +"]===");
		
		System.out.println("name1.equals(name7) : " + name1.equals(name7)); //Case-sensitive
		System.out.println("name7.equals(name1) : " + name7.equals(name1)); //Case-sensitive

		System.out.println("name2.equals(name8) : " + name2.equals(name8)); //Case-sensitive
		System.out.println("name8.equals(name2) : " + name8.equals(name2)); //Case-sensitive
		
		System.out.println("name3.equals(name9) : " + name3.equals(name9)); //Case-sensitive
		System.out.println("name9.equals(name3) : " + name9.equals(name3)); //Case-sensitive
		
		System.out.println("name4.equals(name10) : " + name4.equals(name10)); //Case-sensitive
		System.out.println("name10.equals(name4) : " + name10.equals(name4)); //Case-sensitive
		
		System.out.println("name5.equals(name11) : " + name5.equals(name11)); //Case-sensitive
		System.out.println("name11.equals(name5) : " + name11.equals(name5)); //Case-sensitive
		
		System.out.println("name6.equals(name12) : " + name6.equals(name12)); //Case-sensitive
		System.out.println("name12.equals(name6) : " + name12.equals(name6)); //Case-sensitive
		
		
		System.out.println("\n==========[" + secondGroup + "]==========");
		
		System.out.println("name7.equals(name8) : " + name7.equals(name8));
		System.out.println("name8.equals(name7) : " + name8.equals(name7));
		
		System.out.println("name7.equals(name9) : " + name7.equals(name9));
		System.out.println("name9.equals(name7) : " + name9.equals(name7));
		
		System.out.println("name8.equals(name9) : " + name8.equals(name9));
		System.out.println("name9.equals(name8) : " + name9.equals(name8));
		
		System.out.println("name9.equals(name10) : " + name9.equals(name10));
		System.out.println("name10.equals(name9) : " + name10.equals(name9));
		
		System.out.println("name10.equals(name11) : " + name10.equals(name11));
		System.out.println("name11.equals(name10) : " + name11.equals(name10));
		
		System.out.println("name11.equals(name12) : " + name11.equals(name12));
		System.out.println("name12.equals(name11) : " + name12.equals(name11));
		
		System.out.println("name9.equals(name11) : " + name9.equals(name11));
		System.out.println("name11.equals(name9) : " + name11.equals(name9));
		
		System.out.println("name10.equals(name12) : " + name10.equals(name12));
		System.out.println("name12.equals(name10) : " + name12.equals(name10));
	    
		
		System.out.println("\n========= equalsIgnoreCase() method ============");
		
		System.out.println("first.equalsIgnoreCase(second) : " + first.equalsIgnoreCase(second));
		System.out.println("second.equalsIgnoreCase(first) : " + second.equalsIgnoreCase(first));
		System.out.println("first.equalsIgnoreCase(third) : " + first.equalsIgnoreCase(third));
		System.out.println("third.equalsIgnoreCase(first) : " + third.equalsIgnoreCase(first));
		System.out.println("second.equalsIgnoreCase(third) : " + second.equalsIgnoreCase(third));
		System.out.println("third.equalsIgnoreCase(second) : " + third.equalsIgnoreCase(second));
		
		
		
		System.out.println("\n=========After (equalsIgnoreCase() method) ============");
		
		System.out.println("\n===[" + firstGroup + "]equals["+ secondGroup +"]===");
        
		System.out.println("\n");
		
		System.out.println("name1.equalsIgnoreCase(name7) : " + name1.equalsIgnoreCase(name7)); //Case-insensitive
		System.out.println("name7.equalsIgnoreCase(name1) : " + name7.equalsIgnoreCase(name1)); //Case-insensitive

		System.out.println("name2.equalsIgnoreCase(name8) : " + name2.equalsIgnoreCase(name8)); //Case-insensitive
		System.out.println("name8.equalsIgnoreCase(name2) : " + name8.equalsIgnoreCase(name2)); //Case-insensitive
		
		System.out.println("name3.equalsIgnoreCase(name9) : " + name3.equalsIgnoreCase(name9)); //Case-insensitive
		System.out.println("name9.equalsIgnoreCase(name3) : " + name9.equalsIgnoreCase(name3)); //Case-insensitive
		
		System.out.println("name4.equalsIgnoreCase(name10) : " + name4.equalsIgnoreCase(name10)); //Case-insensitive
		System.out.println("name10.equalsIgnoreCase(name4) : " + name10.equalsIgnoreCase(name4)); //Case-insensitive
		
		System.out.println("name5.equalsIgnoreCase(name11) : " + name5.equalsIgnoreCase(name11)); //Case-insensitive
		System.out.println("name11.equalsIgnoreCase(name5) : " + name11.equalsIgnoreCase(name5)); //Case-insensitive
		
		System.out.println("name6.equalsIgnoreCase(name12) : " + name6.equalsIgnoreCase(name12)); //Case-insensitive
		System.out.println("name12.equalsIgnoreCase(name6) : " + name12.equalsIgnoreCase(name6)); //Case-insensitive
	}

}
