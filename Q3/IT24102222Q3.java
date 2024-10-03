import java.util.Scanner;

public class IT24102222Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i + ":");
            
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();
            
            System.out.print("Enter payment mode (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to pay: " + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount. Amount to pay: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); // Blank line between customers
        }
        
        scanner.close();
    }
}
