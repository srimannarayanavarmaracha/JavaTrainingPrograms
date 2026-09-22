package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo3 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Methods =======================");
		
		System.out.println("\n============== Checking content ================");
		
		String cityName = "Vijayawada";
		String stateName = "Andhra Pradesh";
		
		System.out.println("cityName : " + cityName);
		
		System.out.println("stateName : " + stateName);
		
		System.out.println("\n===== contains() method ======");
		
		System.out.println("cityName.contains(\"Vi\") : " + cityName.contains("Vi"));
		System.out.println("cityName.contains(\"wada\") : " + cityName.contains("wada")); 
		System.out.println("cityName.contains(\"Kanchi\") : " + cityName.contains("Kanchi"));
		System.out.println("cityName.contains(\"Wa\") : " + cityName.contains("Wa")); // java is case-sensitive
		
		System.out.println("stateName.contains(\"An\") : " + stateName.contains("An"));
		System.out.println("stateName.contains(\"Pra\") : " + stateName.contains("Pra")); 
		System.out.println("stateName.contains(\"Uttar\") : " + stateName.contains("Uttar"));
		System.out.println("stateName.contains(\"an\") : " + stateName.contains("an")); // java is case-sensitive
		
		
		
		System.out.println("\n===== startsWith() method ======");
		
		System.out.println("cityName.startsWith(\"Vi\") : " + cityName.startsWith("Vi"));
		System.out.println("cityName.startsWith(\"vi\") : " + cityName.startsWith("vi"));  // java is case-sensitive
		System.out.println("cityName.startsWith(\"wada\") : " + cityName.startsWith("wada")); 
		System.out.println("cityName.startsWith(\"Kanchi\") : " + cityName.startsWith("Kanchi"));
	    
		
		System.out.println("stateName.startsWith(\"An\") : " + stateName.startsWith("An"));
		System.out.println("stateName.startsWith(\"an\") : " + stateName.startsWith("an")); // java is case-sensitive
		System.out.println("stateName.startsWith(\"Pra\") : " + stateName.startsWith("Pra")); 
		System.out.println("stateName.startsWith(\"Uttar\") : " + stateName.startsWith("Uttar"));
		
		
		System.out.println("\n===== endsWith() method ======");
		
		System.out.println("cityName.endsWith(\"wada\") : " + cityName.endsWith("wada"));
		System.out.println("cityName.endsWith(\"Wada\") : " + cityName.endsWith("Wada"));  // java is case-sensitive
		System.out.println("cityName.endsWith(\"da\") : " + cityName.endsWith("da")); 
		System.out.println("cityName.endsWith(\"Vi\") : " + cityName.endsWith("Vi"));
		System.out.println("cityName.endsWith(\"Na\") : " + cityName.endsWith("Na"));
	    
		
		System.out.println("stateName.endsWith(\"sh\") : " + stateName.endsWith("sh"));
		System.out.println("stateName.endsWith(\"sH\") : " + stateName.endsWith("sH")); // java is case-sensitive
		System.out.println("stateName.endsWith(\"esh\") : " + stateName.endsWith("esh")); 
		System.out.println("stateName.endsWith(\"ra\") : " + stateName.endsWith("ra"));
	}

}
