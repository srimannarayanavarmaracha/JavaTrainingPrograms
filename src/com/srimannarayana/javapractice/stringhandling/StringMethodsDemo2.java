package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		
		System.out.println("\n==================== String Methods ======================");
		
		System.out.println("\n========= Character/Text Access =========");
		
		
		String firstName = "Kamakshi Parabattarika";
		String lastName = "Maha Tripura Sundhari Devi";
		
		String fullName = firstName + " " + lastName;
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("fullName : " + fullName);
		
		System.out.println("\n================== charAt() method ==================");
		
		System.out.println("\n====== firstName charAt() =======");
        System.out.println("firstName.length() : " + firstName.length());
		System.out.println("firstName.charAt(0) : " + firstName.charAt(0));
		System.out.println("firstName.charAt(1) : " + firstName.charAt(1));
		System.out.println("firstName.charAt(3) : " + firstName.charAt(3));
		System.out.println("firstName.charAt(5) : " + firstName.charAt(5));
		
		System.out.println("\n====== lastName charAt() =======");
        System.out.println("lastName.length() : " + lastName.length());
    	System.out.println("lastName.charAt(0) : " + lastName.charAt(0));
		System.out.println("lastName.charAt(2) : " + lastName.charAt(2));
		System.out.println("lastName.charAt(3) : " + lastName.charAt(3));
		
		
		System.out.println("\n====== fullName charAt() =======");
        System.out.println("fullName.length() : " + fullName.length());
        System.out.println("fullName.charAt(0) : " + fullName.charAt(0));
        System.out.println("fullName.charAt(1) : " + fullName.charAt(1));
		System.out.println("fullName.charAt(3) : " + fullName.charAt(3));
		System.out.println("fullName.charAt(5) : " + fullName.charAt(5));
		System.out.println("fullName.charAt(8) : " + fullName.charAt(8));
		System.out.println("fullName.charAt(9) : " + fullName.charAt(9));
		
		
		System.out.println("\n================== indexOf() method =================");
		
		System.out.println("\n====== firstName indexOf() =======");
        System.out.println("firstName.length() : " + firstName.length());
		System.out.println("firstName.indexOf('m') : " + firstName.indexOf('m'));
		System.out.println("firstName.indexOf('h') : " + firstName.indexOf('h'));
		System.out.println("firstName.indexOf('i') : " + firstName.indexOf('i'));
		System.out.println("firstName.indexOf('K') : " + firstName.indexOf('K'));
		System.out.println("firstName.indexOf('a') : " + firstName.indexOf('a'));
		System.out.println("firstName.indexOf(\"Ka\") : " + firstName.indexOf("Ka"));
		System.out.println("firstName.indexOf(\"shi\") : " + firstName.indexOf("shi"));
		System.out.println("firstName.indexOf(\"Para\") : " + firstName.indexOf("Para"));
		
		
		System.out.println("\n====== lastName indexOf() =======");
        System.out.println("lastName.length() : " + lastName.length());
    	System.out.println("lastName.indexOf('i') : " + lastName.indexOf('i'));
		System.out.println("lastName.indexOf('D') : " + lastName.indexOf('D'));
		System.out.println("lastName.indexOf('e') : " + lastName.indexOf('e'));
		System.out.println("lastName.indexOf(\"Maha\") : " + lastName.indexOf("Maha"));
		System.out.println("lastName.indexOf(\"Tripura\") : " + lastName.indexOf("Tripura"));
		
		
		
		System.out.println("\n====== fullName indexOf() =======");
        System.out.println("fullName.length() : " + fullName.length());
        System.out.println("fullName.indexOf('K') : " + fullName.indexOf('K'));
        System.out.println("fullName.indexOf('k') : " + fullName.indexOf('k'));
		System.out.println("fullName.indexOf('m') : " + fullName.indexOf('m'));
		System.out.println("fullName.indexOf('a') : " + fullName.indexOf('a'));
		System.out.println("fullName.indexOf('D') : " + fullName.indexOf('D'));
		System.out.println("fullName.indexOf('v') : " + fullName.indexOf('v'));
		System.out.println("fullName.indexOf(\"kshi\") : " + fullName.indexOf("kshi"));
		System.out.println("fullName.indexOf(\"battarika\") : " + fullName.indexOf("battarika"));
		System.out.println("fullName.indexOf(\"Tri\") : " + fullName.indexOf("Tri"));
		System.out.println("fullName.indexOf(\"pura\") : " + fullName.indexOf("pura"));
		
		System.out.println("\n================ lastIndexOf() method ================");
		
		System.out.println("\n====== firstName lastindexOf() =======");
        System.out.println("firstName.length() : " + firstName.length());
		System.out.println("firstName.lastIndexOf('a') : " + firstName.lastIndexOf('a'));
		System.out.println("firstName.lastIndexOf('k') : " + firstName.lastIndexOf('k'));
		System.out.println("firstName.lastIndexOf('P') : " + firstName.lastIndexOf('P'));
		System.out.println("firstName.lastIndexOf('r') : " + firstName.lastIndexOf('r'));
		System.out.println("firstName.lastIndexOf('t') : " + firstName.lastIndexOf('t'));
		System.out.println("firstName.lastIndexOf(\"ma\") : " + firstName.lastIndexOf("ma"));
		System.out.println("firstName.lastIndexOf(\"ks\") : " + firstName.lastIndexOf("ks"));
		System.out.println("firstName.lastIndexOf(\"rika\") : " + firstName.lastIndexOf("rika"));
		
		
		System.out.println("\n====== lastName lastIndexOf() =======");
        System.out.println("lastName.length() : " + lastName.length());
    	System.out.println("lastName.lastIndexOf('n') : " + lastName.lastIndexOf('n'));
		System.out.println("lastName.lastIndexOf('h') : " + lastName.lastIndexOf('h'));
		System.out.println("lastName.lastIndexOf('i') : " + lastName.lastIndexOf('i'));
		System.out.println("lastName.lastIndexOf(\"ha \") : " + lastName.lastIndexOf("ha "));
		System.out.println("lastName.lastIndexOf(\"ra \") : " + lastName.lastIndexOf("ra "));
		
		
		System.out.println("\n====== fullName lastIndexOf() =======");
        System.out.println("fullName.length() : " + fullName.length());
        System.out.println("fullName.lastIndexOf('M') : " + fullName.lastIndexOf('M'));
        System.out.println("fullName.lastIndexOf('T') : " + fullName.lastIndexOf('T'));
		System.out.println("fullName.lastIndexOf('r') : " + fullName.lastIndexOf('r'));
		System.out.println("fullName.lastIndexOf('S') : " + fullName.lastIndexOf('S'));
		System.out.println("fullName.lastIndexOf('d') : " + fullName.lastIndexOf('d'));
		System.out.println("fullName.lastIndexOf('K') : " + fullName.lastIndexOf('K'));
		System.out.println("fullName.lastIndexOf(\"rab\") : " + fullName.lastIndexOf("rab"));
		System.out.println("fullName.lastIndexOf(\"Sund\") : " + fullName.lastIndexOf("Sund"));
		System.out.println("fullName.lastIndexOf(\"Tri\") : " + fullName.lastIndexOf("Tri"));
		System.out.println("fullName.lastIndexOf(\"pura\") : " + fullName.lastIndexOf("pura"));
		
	}

}