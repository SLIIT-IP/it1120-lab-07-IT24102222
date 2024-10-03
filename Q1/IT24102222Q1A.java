import java.util.Scanner;

public class IT24102222Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfSubjects = 4;
        
        // Get marks for 4 subjects from the user
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            
            // Check for valid marks range (0-100)
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid input. Enter marks for subject " + i + " (0-100): ");
                marks = scanner.nextInt();
            }
            totalMarks += marks;
        }
        
        // Calculate the average
        double average = totalMarks / (double) numberOfSubjects;
        System.out.println("Average marks: " + average);
        
        // Determine grade based on average
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        // Display grade
        System.out.println("Overall Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
