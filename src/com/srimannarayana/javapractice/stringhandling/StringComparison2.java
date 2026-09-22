package com.srimannarayana.javapractice.stringhandling;

public class StringComparison2 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Comparison ====================");

		System.out.println("\n========= compareTo() method ============");

		String first = "Apple";
		String second = "Apple";
		String third = "Banana";
		String fourth = "Mango";
		String fifth = "Watermelon";
		
		System.out.println("first : " + first);
		System.out.println("second : " + second);
		System.out.println("third : " + third);
		System.out.println("fourth : " + fourth);
		System.out.println("fifth : " + fifth);
		
		
		System.out.println("first.compareTo(second) : " + first.compareTo(second)); //0
		System.out.println("first.compareTo(third) : " + first.compareTo(third));   //-1
		System.out.println("first.compareTo(fourth) : " + first.compareTo(fourth)); //-12
		System.out.println("first.compareTo(fifth) : " + first.compareTo(fifth));   //-22
		
		
		System.out.println("second.compareTo(first) : " + second.compareTo(first)); //0
		System.out.println("second.compareTo(third) : " + second.compareTo(third)); //-1
		System.out.println("second.compareTo(fourth) : " + second.compareTo(fourth));//-12
		System.out.println("second.compareTo(fifth) : " + second.compareTo(fifth));  //-22
		
		
		System.out.println("third.compareTo(first) : " + third.compareTo(first)); //1
		System.out.println("third.compareTo(second) : " + third.compareTo(second));//1
		System.out.println("third.compareTo(fourth) : " + third.compareTo(fourth));//-11
		System.out.println("third.compareTo(fifth) : " + third.compareTo(fifth)); //-21
		
		
		
		System.out.println("fourth.compareTo(first) : " + fourth.compareTo(first));//12
		System.out.println("fourth.compareTo(second) : " + fourth.compareTo(second));//12
		System.out.println("fourth.compareTo(third) : " + fourth.compareTo(third));//11
		System.out.println("fourth.compareTo(fifth) : " + fourth.compareTo(fifth));//-10
		
		
		System.out.println("fifth.compareTo(first) : " + fifth.compareTo(first));//22
		System.out.println("fifth.compareTo(second) : " + fifth.compareTo(second));//22
		System.out.println("fifth.compareTo(third) : " + fifth.compareTo(third));//21
		System.out.println("fifth.compareTo(fourth) : " + fifth.compareTo(fourth));//10
	}

}
