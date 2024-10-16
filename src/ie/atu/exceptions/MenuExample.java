package ie.atu.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuExample {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            boolean validInput = false;

            // Keep asking the user for input until valid input is provided
            while (!validInput) {
                try {
                    System.out.print("Enter the first integer: ");
                    int num1 = scanner.nextInt();

                    System.out.print("Enter the second integer: ");
                    int num2 = scanner.nextInt();

                    int result = num1 / num2;
                    System.out.println("Result: " + result);
                    validInput = true; // Exit the loop if user enters valid inputs and no exception occurs
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter integers only.");
                    scanner.next(); // Clear the invalid input from the scanner buffer
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero. Please try again.");
                } 
            }  // End of while loop
        }  // End of try block
    }  // End of main method
}  // End of class MenuExample
