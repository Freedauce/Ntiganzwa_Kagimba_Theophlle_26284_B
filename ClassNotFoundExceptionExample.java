// ClassNotFoundException.java
/**
 * This program demonstrates handling a ClassNotFoundException when a class is missing.
 */
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}