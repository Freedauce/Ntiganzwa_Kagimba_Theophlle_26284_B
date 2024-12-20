// IOException.java
/**
 * This program demonstrates handling an IOException when trying to read a non-existent file.
 */
import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            reader.readLine();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
