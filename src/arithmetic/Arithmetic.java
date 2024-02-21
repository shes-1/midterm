package arithmetic;

import java.util.Scanner;

/**
 * This class performs arithmetic operations based on user input.
 * It utilizes an enum for arithmetic operations.
 * 
 * @author Sheshmani 2024
 */
public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for numbers
        System.out.print("Enter the first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double y = sc.nextDouble();

        // Display available operations
        System.out.println("Select operation:");
        for (ArithmeticBase.Operation operation : ArithmeticBase.Operation.values()) {
            System.out.println(operation);
        }

        // Get user's choice of operation
        System.out.print("Enter operation: ");
        String operationStr = sc.next();

        // Convert operation string to enum
        ArithmeticBase.Operation operation;
        try {
            operation = ArithmeticBase.Operation.valueOf(operationStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid operation: " + operationStr);
            return; // Exit program if invalid operation
        }

        // Perform calculation and print result
        ArithmeticBase arithmeticBase = new ArithmeticBase();
        double result = arithmeticBase.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}
