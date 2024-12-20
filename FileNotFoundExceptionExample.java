// FileNotFoundException.java
/**
 * This program demonstrates handling a FileNotFoundException when a file is not found.
 */
import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        }
    }
}
