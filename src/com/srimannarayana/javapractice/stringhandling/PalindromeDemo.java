package com.srimannarayana.javapractice.stringhandling;

public class PalindromeDemo {

	public static void main(String[] args) {
		
		String word = "radar";
        char[] chars = word.toCharArray();
        
        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

	}

}
