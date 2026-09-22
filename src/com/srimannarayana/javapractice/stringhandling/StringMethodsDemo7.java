package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo7 {

	public static void main(String[] args) {
		
		System.out.println("\n====================== String Methods ====================");
		
		System.out.println("\n========= Splitting and joining ============");
        
		String fullName = "Srimannarayana,Varma,Racha";
		
		
		String[] names = fullName.split(",");
		
		System.out.println("fullName : " + fullName);
		
		System.out.println("firstName : " + names[0]);
		System.out.println("middleName : " + names[1]);
		System.out.println("lastName : " + names[2]);
		
		String rejoinedName = String.join(" - ", names);
		System.out.println("Rejoined Name : " + rejoinedName);
		
		
		String fruitNames = "Apple,Banana,Orange,Mango,Papaya,Watermelon";
		
		String[] fruits = fruitNames.split(",");
		
		System.out.println("fruitNames : " + fruitNames);
		
		System.out.println("Fruit Name1 : " + fruits[0]);
		System.out.println("Fruit Name2 : " + fruits[1]);
		System.out.println("Fruit Name3 : " + fruits[2]);
		System.out.println("Fruit Name4 : " + fruits[3]);
		System.out.println("Fruit Name5 : " + fruits[4]);
		System.out.println("Fruit Name6 : " + fruits[5]);
		
		String rejoinedFruitNames = String.join(" _ ", fruits);
		System.out.println("Rejoined FruitNames : " + rejoinedFruitNames);
		
		
		String sentence = "Java is fun";
		String[] words = sentence.split("\\s+");
		
		System.out.println("sentence : " + sentence);
		
		System.out.println("word 1 : " +  words[0]);
		System.out.println("word 1 : " +  words[1]);
		System.out.println("word 1 : " +  words[2]);
		
		String rejoinedSentence = String.join(" _ ", words);
		System.out.println("rejoinedSentence : " + rejoinedSentence);
		
		String text = "Look-at-this-string";
		String[] parts = text.split("-", 2);
		
		System.out.println("text : " + text);
		
		System.out.println("parts : " + parts[0]);
		System.out.println("parts : " + parts[1]);
		
		String rejoinedText = String.join(" _ ", parts);
		System.out.println("rejoinedText : " + rejoinedText);
		
		String instaBio = "Its-always-me-Vs-my-mind";
		String[] word = instaBio.split("-");
		String[] sayingL = instaBio.split("-", 4);
		
        System.out.println("instaBio : " + instaBio);
	
		System.out.println("word1 : " + word[0]);
		System.out.println("word2 : " + word[1]);
		System.out.println("word3 : " + word[2]);
		System.out.println("word4 : " + word[3]);
		System.out.println("word5 : " + word[4]);
		System.out.println("word6 : " + word[5]);
		
		System.out.println("sayingL : " + sayingL[0]);
		System.out.println("sayingL : " + sayingL[1]);
		System.out.println("sayingL : " + sayingL[2]);
		System.out.println("sayingL : " + sayingL[3]);
		
		String rejoinedinstaBio = String.join(" _ ", word);
		System.out.println("rejoined instaBio : " + rejoinedinstaBio);
		
	    String mobileBrands = "Redmi,realme,samsung,vivo,Oneplus";
	    
	    String[] mBrands = mobileBrands.split(",");
	    
	    System.out.println("mobileBrands : " + mobileBrands);
	    
	    System.out.println("mBrands1 : " + mBrands[0]);
	    System.out.println("mBrands1 : " + mBrands[1]);
	    System.out.println("mBrands1 : " + mBrands[2]);
	    System.out.println("mBrands1 : " + mBrands[3]);
	    System.out.println("mBrands1 : " + mBrands[4]);
	    
	    String rejoinedmobileBrands = String.join("_", mBrands);
	    
	    System.out.println("rejoinedmobileBrands : " + rejoinedmobileBrands);
		
		
		String letters = "a.b.c";
		
		System.out.println(letters.replace(".", "-"));
		
		System.out.println(letters.replaceFirst(".", "-"));
		
	}

}
  