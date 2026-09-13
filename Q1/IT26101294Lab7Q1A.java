import java.util.Scanner;

public class IT26101294Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[4]; 
        
        System.out.println("Enter marks for four subjects:");

        for (int i = 0; i < marks.length; ) {
            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            int inputMark = scanner.nextInt();
            
            if (inputMark >= 0 && inputMark <= 100) {
                marks[i] = inputMark; 
                i++;                  
            } else {
                System.out.println("invalid input for marks");
            }
        }
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        double average = total / marks.length;
        System.out.println("Average is: " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is: Credit");
        } else {
            System.out.println("Overall Grade is: Fail");
        }
    }
}