package com.srimannarayana.javapractice.stringpool;

public class StringDataTypeDemo2 {

	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Favreau";

		String fullName = firstName + " " + lastName;
		
		//============ First Name =============
		
		System.out.println("\n============ First Name =============");
				
		
		
		System.out.println("First Name : " + firstName);
		System.out.println("Length : " + firstName.length());
		System.out.println("Character at Index 0 : " + firstName.charAt(0));
		System.out.println("Character at Index 1 : " + firstName.charAt(1));
		System.out.println("Character at Index 3 : " + firstName.charAt(3));
		System.out.println("Uppercase : " + firstName.toUpperCase());
		System.out.println("Lowercase : " + firstName.toLowerCase());
		System.out.println("Equals John : " + firstName.equals("John"));
		System.out.println("Contains oh : " + firstName.contains("oh"));
		
		System.out.println("Substring (1, 3) : " + firstName.substring(1, 3));
		
		System.out.println("Replace hn with rd : " + firstName.replace("hn", "rd"));
		
		System.out.println("Replace John with Robert : " + firstName.replace("John", "Robert"));
		
		String updatedFirstName = firstName.replace("John", "Robert");
		
		System.out.println("Updated First Name : " + updatedFirstName);
		
		
		//============Last Name =============
		
		System.out.println("\n============ Last Name =============");
				
		
		System.out.println("Last Name : " + lastName);
		System.out.println("Length : " + lastName.length());
		System.out.println("Character at Index 0 : " + lastName.charAt(0));
		System.out.println("Character at Index 1 : " + lastName.charAt(1));
		System.out.println("Character at Index 2 : " + lastName.charAt(2));
		System.out.println("Character at Index 3 : " + lastName.charAt(3));
		System.out.println("Character at Index 4 : " + lastName.charAt(4));
		System.out.println("Character at Index 5 : " + lastName.charAt(5));
		System.out.println("Character at Index 6 : " + lastName.charAt(6));
		System.out.println("Uppercase : " + lastName.toUpperCase());
		System.out.println("Lowercase : " + lastName.toLowerCase());
		System.out.println("Equals Dolly : " + lastName.equals("Dolly"));
		System.out.println("Contains u : " + lastName.contains("u"));
		
		System.out.println("Substring (1, 5) : " + lastName.substring(1, 5));
		
		System.out.println("Replace Fa with Se : " + lastName.replace("Fa", "Se"));
		
		System.out.println("Replace Favreau with Downey : " + lastName.replace("Favreau", "Downey"));
		
		String updatedLastName = lastName.replace("Favreau", "Downey");
		
		System.out.println("Updated Last Name : " + updatedLastName);
		
		
		//============Full Name =============
		
		System.out.println("\n============ Full Name =============");
				
		
		
		System.out.println("Full Name : " + fullName);
		System.out.println("Length : " + fullName.length());
		System.out.println("Character At Index 0 : " + fullName.charAt(0));
		System.out.println("Character At index 1 : " +fullName.charAt(1));
		System.out.println("Character At index 6 : " +fullName.charAt(6));
		System.out.println("Character At index 7 : " +fullName.charAt(7));
		System.out.println("Character At index 4 : " +fullName.charAt(4));
		System.out.println("Uppercase : " + fullName.toUpperCase());
		System.out.println("Lowercase : " + fullName.toLowerCase());
		System.out.println("Equals Chris Evans : " + fullName.equals("Chris Evans"));
		System.out.println("Contains Fav : " + fullName.contains("Fav"));
		
		System.out.println("Substring (1, 6) : " + fullName.substring(1, 6));
		
		System.out.println("Replace John Favreau with Jr. : " + fullName.replace("John Favreau", "Jr."));
	    
		String updatedFullName = fullName.replace("John Favreau", "Jr.");
		
		System.out.println("Updated Full Name : " + updatedFullName);
		
		
		
		
		
		// ================== Combined Result ===================
		
		System.out.println("\n=================== Combined Result ===================");
		
		
		String combinedName = updatedFirstName + " " + updatedLastName + " " + updatedFullName;
		
		System.out.println(combinedName);
		
		String textWithSpaces = "  " + combinedName + "  ";
		
		System.out.println("Before Trim : [" + textWithSpaces + "]");
		
		System.out.println("After Trim : [" + textWithSpaces.trim() + "]");
		
	}

}
