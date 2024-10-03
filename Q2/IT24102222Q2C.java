public class IT24102222Q2C{
    public static void main(String[] args) {
        // Loop to control the starting number (5 to 1)
        for (int i = 5; i >= 1; i--) {
            // Loop to print the current number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
