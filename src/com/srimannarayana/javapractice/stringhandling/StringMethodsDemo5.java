package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo5 {

	public static void main(String[] args) {
		
		System.out.println("\n================== String Method ===================");
		
		System.out.println("\n============= Changing text ===============");
		
		String firstName = "Srimannarayana Varma";
		String lastName = "Racha";
		
		String birthPlace = "Amalapuram";
		String stateName = "Andhra Pradesh";
		
		String instaId = "vsri2310457484";
		String instaId1 = "smev231028786";
		
		System.out.println("firstNamae : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("birthPlace : " + birthPlace);
		System.out.println("stateName : " + stateName);
		System.out.println("instaId : " + instaId);
		System.out.println("instaId1 : " + instaId1);
		
		System.out.println("\n============ toUpperCase() ==============");
		
		System.out.println("firstName.toUppercase() : " + firstName.toUpperCase());
		System.out.println("lastName.toUppercase() : " + lastName.toUpperCase());
		System.out.println("birthPlace.toUpperCase() : " + birthPlace.toUpperCase());
		System.out.println("stateName.toUpperCase() : " + stateName.toUpperCase());
		
		System.out.println("\n============ toLowerCase() ==============");
		
		System.out.println("firstName.toLowercase() : " + firstName.toLowerCase());
		System.out.println("lastName.toLowerCase() : " + lastName.toLowerCase());
		System.out.println("birthPlace.toLowerCase() : " + birthPlace.toLowerCase());
		System.out.println("stateName.toLowerCase() : " + stateName.toLowerCase());
		
		
		System.out.println("\n============== replace() ===================");
		
		System.out.println("firstName.replace(\"a\", \"e\")) : " + firstName.replace("a", "e"));
		System.out.println("lastName.replace(\"cha\", \"ra\") : " + lastName.replace("cha", "ra"));
		System.out.println("firstName.replace(\"Srimannarayana\", \"Srinivas\")) : " + firstName.replace("Srimannarayana", "Srinivas"));
		System.out.println("lastName.replace(\"Racha\", \"Smevar\") : " + lastName.replace("Racha", "Smevar"));
		System.out.println("birthPlace.replace('A', 'S') : " + birthPlace.replace('A', 'S'));
		System.out.println("stateName.replace('P', 'R') : " + stateName.replace('P', 'R'));
		
		
		
		System.out.println("\n============== replaceFirst() ===================");
		
		System.out.println("firstName.replaceFirst(\"i\", \"ee\")) : " + firstName.replaceFirst("i", "ee"));
		System.out.println("lastName.replaceFirst(\"a\", \"i\") : " + lastName.replaceFirst("a", "i"));
		System.out.println("birthPlace.replaceFirst(\"a\", \"g\") : " + birthPlace.replaceFirst("a", "g"));
		System.out.println("stateName.replaceFirst(\"dh\", \"Madh\") : " + stateName.replaceFirst("dh", "Madh"));
		
		
		System.out.println("\n============== replaceAll() ===================");
		
		System.out.println("firstName.replaceAll(firstName, (\"Meghana Srimannarayana Varma \" + lastName)) : " + firstName.replaceAll(firstName, ("Meghana Srimannarayana Varma " + lastName)));
		System.out.println("lastName.replaceAll(lastName, \"MSriVarma\") : " + lastName.replaceAll(lastName, "MSriVarma"));
		
		System.out.println("lastName.replaceAll(\"[a-z]\", \"#\") : " + lastName.replaceAll("[a-z]", "#"));
		System.out.println("firstName.replaceAll(\"[a-p]\", \"@\") : " + firstName.replaceAll("[a-p]", "@"));
		
		System.out.println("instaId.replaceAll(\"[0-9]\", \"&\") : " + instaId.replaceAll("[0-9]", "&"));
		System.out.println("instaId1.replaceAll(\"[0-9]\", \"%\") : " + instaId1.replaceAll("[0-9]", "%"));
		
		System.out.println("lastName.replaceAll(lastName, firstName) : " + lastName.replaceAll(lastName, firstName));
		System.out.println("firstName.replaceAll(firstName, lastName) : " + firstName.replaceAll(firstName, lastName));
		
		System.out.println("birthPlace.replaceAll(birthPlace, stateName) : " + birthPlace.replaceAll(birthPlace, stateName));
		System.out.println("stateName.replaceAll(stateName, birthPlace) : " + stateName.replaceAll(stateName, birthPlace));
		
		System.out.println("birthPlace.replaceAll(birthPlace, \"Anakapalli\") : " + birthPlace.replaceAll(birthPlace, "Anakapalli"));
		System.out.println("stateName.replaceAll(stateName, \"West Bengal\") : " + stateName.replaceAll(stateName, "West Bengal"));
		
		// IllegalArgumentException: Illegal group reference occurs when '$' is used
		// as a replacement string in replaceAll().
		
		//System.out.println(instaId1.replaceAll("[0-9]", "$"));
		
		System.out.println(instaId1.replaceAll("[0-9]", "\\$"));
		
		System.out.println("instaId1.replaceAll(\"[0-9]\", \"\\\\$\") : " + instaId1.replaceAll("[0-9]", "\\$"));
		
		// java.util.regex.Matcher.quoteReplacement()
		
		System.out.println("instaId1.replaceAll(\"[0-9]\", java.util.regex.Matcher.quoteReplacement(\"$\")) : " + instaId1.replaceAll("[0-9]", java.util.regex.Matcher.quoteReplacement("$")));
	}

}
