
package arithmetic;

/** 
 * This class takes String input plus, minus, divide, and times
 * from the user and executes the arithmetic operation.
 * Change the code to use enum instead of String and mention the advantage of enum.
 * 
 * Advantages of using enum:
 * - Type safety: Enums provide compile-time type safety, preventing the use of invalid operations.
 * - Readability: Enums make the code more readable by providing meaningful names for operations.
 * - Maintainability: It's easier to maintain the code because all valid operations are defined in one place.
 * 
 * @author Sheshmani
 */

/**
 * This class performs arithmetic operations based on user input.
 * It utilizes an enum for arithmetic operations.
 * 
 * @author Sheshmani
 */
public class ArithmeticBase {

    public enum Operation {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE
    }

    public double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return x / y;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
