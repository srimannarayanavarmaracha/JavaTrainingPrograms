package myfirstproject;

import java.util.Scanner;

public class DecimalVariables {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your GPA : ");
	    float gpa = scanner.nextFloat();

	    System.out.print("Enter your percentage : ");
	    double percentage = scanner.nextDouble();

	    System.out.println("--- Height Entry ---");
	    System.out.print("Enter feets : ");
	    int feet = scanner.nextInt();

	    System.out.print("Enter inches : ");
	    int inches = scanner.nextInt();

	    int heightinInches =  (feet * 12) + inches ;
	    double cmperInch = 2.54;
	    double heightinCM = cmperInch * heightinInches ;


	    System.out.println("Your GPA : " + gpa + "GPA");
	    System.out.println("Your percentage : " + percentage + "%");
	    System.out.println("Your Height : " + feet + "'" + inches + "fts" );
	    System.out.println("Your Height (inches): " + heightinInches + " inches");
	    System.out.println("Your Height (cm) : " + heightinCM + "cm");

	    scanner.close();
	}

}
