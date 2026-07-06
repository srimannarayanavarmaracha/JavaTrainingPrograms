package myfirstproject;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EnhancedDecimalVariables {
    
    // Constants for better maintainability
    static final double CM_PER_INCH = 2.54;
    private static final double GPA_MAX = 4.0;
    private static final double PERCENTAGE_MAX = 100.0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        
        System.out.println("🎓 STUDENT PROFILE CALCULATOR 🎓");
        System.out.println("================================\n");
        
        // 1. GPA Input with validation
        float gpa = getValidGPA(scanner);
        
        // 2. Percentage Input with validation
        double percentage = getValidPercentage(scanner);
        
        // 3. Height Input with validation
        HeightInfo height = getValidHeight(scanner);
        
        // Display results with beautiful formatting
        displayResults(gpa, percentage, height);
        
        // Bonus: BMI Calculator
        calculateBMI(scanner, height);
        
        scanner.close();
        System.out.println("\n✅ Thank you for using Student Profile Calculator!");
    }
    
    // Input validation methods
    private static float getValidGPA(Scanner scanner) {
        float gpa;
        do {
            System.out.print("Enter your GPA (0.0 - 4.0): ");
            try {
                gpa = scanner.nextFloat();
                if (gpa >= 0 && gpa <= GPA_MAX) {
                    return gpa;
                } else {
                    System.out.println("❌ Invalid GPA! Must be between 0.0 and 4.0\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a valid number.\n");
                scanner.next(); // Clear invalid input
            }
        } while (true);
    }
    
    private static double getValidPercentage(Scanner scanner) {
        double percentage;
        do {
            System.out.print("Enter your percentage (0.0 - 100.0): ");
            try {
                percentage = scanner.nextDouble();
                if (percentage >= 0 && percentage <= PERCENTAGE_MAX) {
                    return percentage;
                } else {
                    System.out.println("❌ Invalid percentage! Must be between 0.0 and 100.0\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a valid number.\n");
                scanner.next();
            }
        } while (true);
    }
    
    private static HeightInfo getValidHeight(Scanner scanner) {
        int feet, inches;
        do {
            System.out.println("\n--- Height Entry ---");
            System.out.print("Enter feet (0-8): ");
            feet = getValidInt(scanner, 0, 8);
            
            System.out.print("Enter inches (0-11): ");
            inches = getValidInt(scanner, 0, 11);
            
            if (feet * 12 + inches > 120) { // Max reasonable height ~10ft
                System.out.println("❌ Unrealistic height! Please try again.\n");
                continue;
            }
            return new HeightInfo(feet, inches);
            
        } while (true);
    }
    
    private static int getValidInt(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("❌ Must be between " + min + " and " + max + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter a valid integer!");
                scanner.next();
            }
        }
    }
    
    // Display formatted results
    private static void displayResults(float gpa, double percentage, HeightInfo height) {
        System.out.println("\n🎉 RESULTS SUMMARY 🎉");
        System.out.println("========================");
        System.out.printf("📚 GPA:           %.2f/4.0%n", gpa);
        System.out.printf("📊 Percentage:    %.1f%%%n", percentage);
        System.out.printf("📏 Height:        %d'%02d\" (%.1f inches)%n", 
                         height.feet, height.inches, height.totalInches);
        System.out.printf("📐 Height (CM):   %.1f cm%n", height.totalCM);
        
        // Grade evaluation
        String grade = getGrade(gpa, percentage);
        System.out.println("🎖️  Academic Grade: " + grade);
    }
    
    private static String getGrade(float gpa, double percentage) {
        if (gpa >= 3.7 || percentage >= 90) return "A+ (Excellent!)";
        if (gpa >= 3.3 || percentage >= 80) return "A (Very Good!)";
        if (gpa >= 3.0 || percentage >= 70) return "B (Good!)";
        if (gpa >= 2.7 || percentage >= 60) return "C (Average)";
        return "Needs Improvement";
    }
    
    // Bonus BMI Calculator
    private static void calculateBMI(Scanner scanner, HeightInfo height) {
        System.out.println("\n--- BONUS: BMI Calculator ---");
        System.out.print("Enter your weight (kg): ");
        double weight = getValidDouble(scanner, 20, 300);
        
        double heightMeters = height.totalCM / 100.0;
        double bmi = weight / (heightMeters * heightMeters);
        
        System.out.printf("📊 BMI: %.1f%n", bmi);
        String category = getBMICategory(bmi);
        System.out.println("🏷️  Category: " + category);
    }
    
    private static double getValidDouble(Scanner scanner, double min, double max) {
        while (true) {
            try {
                double value = scanner.nextDouble();
                if (value >= min && value <= max) return value;
                else System.out.println("❌ Must be between " + min + " and " + max + "!");
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter a valid number!");
                scanner.next();
            }
        }
    }
    
    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
}

// Helper class for height data
class HeightInfo {
    int feet, inches;
    double totalInches, totalCM;
    
    HeightInfo(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        this.totalInches = feet * 12 + inches;
        this.totalCM = totalInches * EnhancedDecimalVariables.CM_PER_INCH;
    }
}