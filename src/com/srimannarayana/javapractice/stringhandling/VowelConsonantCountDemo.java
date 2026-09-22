package com.srimannarayana.javapractice.stringhandling;

public class VowelConsonantCountDemo {

	public static void main(String[] args) {
		
		String sentence = "Baglamukhi Devi and Pratyangira Devi are the names of daughters";
		char[] chars = sentence.toLowerCase().toCharArray();
		
		int vowels = 0;
		int consonants = 0;
		
		for (char c : chars) {
			if (c >= 'a' && c <= 'z') {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
			
		}
		
		System.out.println("Text : " + sentence);
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}

}
