public class IT24102222Q2B {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the number
            System.out.print(i + " - ");
            // Loop to print stars equal to the number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
