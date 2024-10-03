import java.util.Scanner;

public class IT24102222Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter marks for 4 subjects (separated by space) for Student " + student + ": ");
            String input = scanner.nextLine();
            String[] marks = input.split(" ");
            
            if (marks.length != 4) {
                System.out.println("Error: Please enter exactly 4 marks.");
                continue;
            }

            // Convert input marks to integers
            int sum = 0;
            try {
                for (String mark : marks) {
                    sum += Integer.parseInt(mark);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
                continue;
            }

            // Calculate average
            double average = sum / 4.0;

            // Determine grade
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            // Display result
            System.out.printf("Student %d - Average: %.2f, Grade: %s%n", student, average, grade);
        }

        scanner.close();
    }
}
