// NumberFormatException.java
/**
 * This program demonstrates handling a NumberFormatException when parsing invalid strings.
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String[] numbers = {"123", "456", "abc", "", "789.01", "9999999999999999999"};

        for (String num : numbers) {
            try {
                int parsedNumber = Integer.parseInt(num);
                System.out.println("Parsed number: " + parsedNumber);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occurred for input '" + num + "': " + e.getMessage());
            }
        }
    }
}