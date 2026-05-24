import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        // ---- try-catch (checked exceptions) ----
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs");
        }

        // ---- Multiple catch blocks ----
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic catch: " + e);
        }

        // ---- try-with-resources (AutoCloseable, Java 7+) ----
        // Resources are automatically closed after the try block
        try (BufferedReader reader = new BufferedReader(new StringReader("Hello"))) {
            String line = reader.readLine();
            System.out.println("Read: " + line);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        // ---- Custom exception ----
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }

    // Method declaring it throws a custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid (must be 18+)");
        }
        System.out.println("Age " + age + " is valid");
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
