package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo9 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Methods ====================");
			
		System.out.println("\n========= Splitting and joining ============");
		
		String paragraph = "Lorem ipsum dolor sit amet consectetur adipiscing elit";
		
		String[] words = paragraph.split("\\s+");
		
		System.out.println("\nparagraph : " + paragraph);
		
		System.out.println("First word : " + words[0]);
		System.out.println("Second word : " + words[1]);
		System.out.println("Third word : " + words[2]);
		System.out.println("Fourth word : " + words[3]);
		System.out.println("Fifth word : " + words[4]);
		System.out.println("Sixth word : " + words[5]);
		System.out.println("Seventh word : " + words[6]);
		System.out.println("Eighth word : " + words[7]);
		
		String rejoinedParagraph = String.join("\\&", words);
		
		System.out.println("rejoinedParagraph : " + rejoinedParagraph);
	}

}
