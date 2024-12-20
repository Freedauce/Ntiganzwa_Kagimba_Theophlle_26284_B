// ArrayIndexOutOfBoundsException.java
/**
 * This program demonstrates handling an ArrayIndexOutOfBoundsException by accessing an invalid index.
 */
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int invalidIndexValue = numbers[5]; // Index 5 is out of bounds
            System.out.println("Value at index 5: " + invalidIndexValue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}