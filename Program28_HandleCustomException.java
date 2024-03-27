// Custom exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Program28_HandleCustomException {
    // Method that throws the custom exception
    public static void divide(int numerator, int denominator) throws MyCustomException {
        if (denominator == 0) {
            throw new MyCustomException("Division by zero is not allowed!");
        }
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }

    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0; // Change this value to see the custom exception

            divide(numerator, denominator);
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception:");
            System.out.println(e.getMessage());
        }
    }
}
