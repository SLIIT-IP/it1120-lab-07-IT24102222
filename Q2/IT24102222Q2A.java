public class IT24102222Q2A {
    public static void main(String[] args) {
        // Outer loop for 4 rows
        for (int i = 0; i < 4; i++) {
            // Inner loop for 5 dollar signs in each row
            for (int j = 0; j < 5; j++) {
                System.out.print("$ ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
