// IllegalArgumentException.java
/**
 * This program demonstrates handling an IllegalArgumentException when invalid arguments are passed.
 */
public class IllegalArgumentExceptionExample {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Square root of 16: " + calculateSquareRoot(16));
            System.out.println("Square root of -9: " + calculateSquareRoot(-9)); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}

