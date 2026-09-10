package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo1 {

	public static void main(String[] args) {
		
System.out.println("\n========== String Methods ==========");
		
		String goddessName = "Kanaka Durga Devi";
		String cityName = "Vijayawada";
		String landmark = "Indrakiladri hill";
		String state = "Andhra Pradesh";
		String country = "India";
		String emptyString = "";
		String blankString = "  ";
		
		
		System.out.println("Goddess Name : " + goddessName);
		System.out.println("City Name : " + cityName);
		System.out.println("Location : " + landmark);
		System.out.println("State : " + state);
		System.out.println("Country : " + country);
		System.out.println("emptyString : " + emptyString);
		System.out.println("blankString : [" + blankString + "]");
		
		
		System.out.println("\n========= length() method =========");
		
		System.out.println("goddessName.length() : " + goddessName.length());
		System.out.println("cityName.length() : " + cityName.length());
		System.out.println("landmark.length() : " + landmark.length());
		System.out.println("state.length() : " + state.length());
		System.out.println("country.length() : " + country.length());
		System.out.println("emptyString.length() : " + emptyString.length());
		System.out.println("blankString.length() : " + blankString.length());
		
		
		
		System.out.println("\n=========== isEmpty() method ==========");
		
		System.out.println("goddessName.isEmpty() : " + goddessName.isEmpty());
		System.out.println("cityName.isEmpty() : " + cityName.isEmpty());
		System.out.println("landmark.isEmpty() : " + landmark.isEmpty());
		System.out.println("state.isEmpty() : " + state.isEmpty());
		System.out.println("country.isEmpty() : " + country.isEmpty());
		System.out.println("emptyString.isEmpty() : " + emptyString.isEmpty());
		System.out.println("blankString.isEmpty() : " + blankString.isEmpty());
		
		
		System.out.println("\n=========== isBlank() method ==========");
		
		System.out.println("goddessName.isBlank() : " + goddessName.isBlank());
		System.out.println("cityName.isBlank() : " + cityName.isBlank());
		System.out.println("landmark.isBlank() : " + landmark.isBlank());
		System.out.println("state.isBlank() : " + state.isBlank());
		System.out.println("country.isBlank(): " + country.isBlank());
		System.out.println("emptyString.isBlank() : " + emptyString.isBlank());
		System.out.println("blankString.isBlank() : " + blankString.isBlank());
		

	}

}
