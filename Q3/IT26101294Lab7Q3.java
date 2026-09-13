import java.util.Scanner;

public class IT26101294Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double amount = scanner.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = scanner.next().charAt(0);
            
            if (mode == 'C' || mode == 'c') {
                double discount = amount * 0.05;
                double finalAmount = amount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + finalAmount);
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println(); 
        }
    }
}