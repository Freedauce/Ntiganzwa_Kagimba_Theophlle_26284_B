// NullPointerException.java
/**
 * This program demonstrates handling a NullPointerException by accessing a null reference.
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); // This line will throw NullPointerException
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
