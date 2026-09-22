package com.srimannarayana.javapractice.stringhandling;

public class AdvancedPalindromeDemo {

	public static void main(String[] args) {
		
		String phrase = "Race car";
        
        // Convert the string to a character array
        char[] chars = phrase.toCharArray();
        
        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // 1. Skip spaces or non-letter/digit characters from the left
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
                continue;
            }
            
            // 2. Skip spaces or non-letter/digit characters from the right
            if (!Character.isLetterOrDigit(chars[right])) {
                right--;
                continue;
            }
            
            // 3. Compare characters case-insensitively
            char leftChar = Character.toLowerCase(chars[left]);
            char rightChar = Character.toLowerCase(chars[right]);
            
            if (leftChar != rightChar) {
                isPalindrome = false;
                break;
            }
            
            // Move both pointers inward
            left++;
            right--;
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println("\"" + phrase + "\" is a palindrome!");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome.");
        }
	}

}
