package myfirstproject;

public class ArrayPractice {

	public static void main(String[] args) {
		 int[] arr = {1, 0, 2, 4, 5, 0, 9, 0, 6};
		 
		 int j = 0;

	        
	     for (int i = 0; i < arr.length; i++) {
	         if (arr[i] != 0) {
	             arr[j++] = arr[i];
	         }
	     }

	     while (j < arr.length) {
	         arr[j++] = 0;
	     }

	        // Print result
	     System.out.print("{");
	     for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i]);
	         if (i < arr.length - 1) {
	             System.out.print(", ");
	         }
	     }
	     
	     System.out.println("}");

	}

}
