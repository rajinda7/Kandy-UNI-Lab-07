import java.util.Scanner;

public class IT26101294Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] marks = new int[3][4]; 
        
        for (int student = 0; student < marks.length; student++) {
            System.out.println("Student " + (student + 1));
            System.out.print("Enter marks: ");
            
            for (int i = 0; i < marks[student].length; ) {
                int inputMark = scanner.nextInt();
                
                if (inputMark >= 0 && inputMark <= 100) {
                    marks[student][i] = inputMark; 
                    i++;                          
                } else {
                    System.out.println("invalid input for marks");
                }
            }
           
            double total = 0;
            for (int i = 0; i < marks[student].length; i++) {
                total += marks[student][i];
            }
            
            double average = total / marks[student].length;
            System.out.println("Average is : " + average);
            
            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }
            
            System.out.println(); 
        }
    }
}