// SQLExceptionExample.java
/**
 * This program demonstrates handling a SQLException when attempting to connect to a non-existent database.
 */
import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nonexistent_db";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String invalidSQL = "SELECT * FRM some_table"; // 'FROM' is misspelled
            statement.executeQuery(invalidSQL);
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }
    }
}
