package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo4 {

	public static void main(String[] args) {
		
		System.out.println("\n========================== String Methods =============================");
		
		System.out.println("\n=============== Extracting text ================");
		
		String cityName = "Kanchipuram";
		String stateName = "Tamilnadu";
		
		System.out.println("cityName : " + cityName);
		System.out.println("stateName : " + stateName);
		
		System.out.println("\n========= substring() method ==========");
		
		// Returns a part of the original String based on the specified indexes
				
		System.out.println("cityName.substring(0, 6) : " + cityName.substring(0, 6));
		System.out.println("cityName.substring(1, 8) : " + cityName.substring(1, 8));
		System.out.println("cityName.substring(2, 6) : " + cityName.substring(2, 6));
		System.out.println("cityName.substring(0, 11) : " + cityName.substring(0, 11));
		System.out.println("cityName.substring(5) : " + cityName.substring(5));
		System.out.println("cityName.substring(3) : " + cityName.substring(3));
		System.out.println("cityName.substring(8) : " + cityName.substring(8));
		
		
		System.out.println("stateName.substring(0, 5) : " + stateName.substring(0, 5));
		System.out.println("stateName.substring(5, 8) : " + stateName.substring(5, 8));
		System.out.println("stateName.substring(2, 6) : " + stateName.substring(2, 6));
		System.out.println("stateName.substring(3, 7) : " + stateName.substring(3, 7));
		System.out.println("stateName.substring(1) : " + stateName.substring(1));
		System.out.println("stateName.substring(0) : " + stateName.substring(0));
		System.out.println("stateName.substring(5) : " + stateName.substring(5));
		
        System.out.println("\n============ subSequence() method ===========");
        
        // Returns a part of the String as a CharSequence.

		System.out.println("cityName.substring(0, 6) : " + cityName.substring(0, 6));
		System.out.println("cityName.subSequence(0, 6) : " + cityName.subSequence(0, 6));
		System.out.println("cityName.subSequence(1, 8) : " + cityName.subSequence(1, 8));
		System.out.println("cityName.subSequence(2, 6) : " + cityName.subSequence(2, 6));
		System.out.println("cityName.subSequence(0, 11) : " + cityName.subSequence(0, 11));
		
		System.out.println("stateName.subSequence(0, 5) : " + stateName.subSequence(0, 5));
		System.out.println("stateName.subSequence(5, 8) : " + stateName.subSequence(5, 8));
		System.out.println("stateName.subSequence(2, 6) : " + stateName.subSequence(2, 6));
		System.out.println("stateName.subSequence(3, 7) : " + stateName.subSequence(3, 7));
	}

}
