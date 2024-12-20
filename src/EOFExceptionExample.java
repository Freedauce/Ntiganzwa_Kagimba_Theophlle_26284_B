// EOFException.java
/**
 * This program demonstrates handling an EOFException when reading beyond the end of a file.
 */
import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("example.txt"))) {
            while (true) {
                dis.readByte();
            }
        } catch (EOFException e) {
            System.out.println("EOFException occurred: End of file reached.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
