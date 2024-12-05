package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

/*
Checked Exceptions:
These are exceptions that are checked at compile-time.
They must be either caught or declared in the method signature using the throws keyword.
1.IOException
2.SQLException

When are IOException and SQLException used?
IOException:
IOException is used to signal an input/output operation failure or interruption.
It is a general class of exceptions produced by failed or interrupted I/O operations.
Common scenarios where IOException is used:
    1.Reading or Writing Files: When reading from or writing to files, you might encounter IOException due to issues like the file not existing, permission issues, or disk errors.
    2.Network Operations: When performing network operations such as socket programming, IOException may occur if the connection is lost or fails.
    3.Stream Operations: When reading from or writing to streams (e.g., InputStream, OutputStream), IOException can be thrown if there is an error in the stream operations.

SQLException:
SQLException is used to indicate that an error has occurred while interacting with a database.
It is thrown when there is a problem with accessing or manipulating the database.
Common scenarios where SQLException is used:
    1.Database Connectivity Issues: When establishing a connection to a database, SQLException can occur if the database is unreachable or the connection details are incorrect.
    2.SQL Query Execution: When executing SQL queries (e.g., SELECT, INSERT, UPDATE, DELETE), SQLException may be thrown if there is an error in the SQL syntax or if constraints (like unique constraints) are violated.
    3.Transaction Management: When managing database transactions, SQLException can occur if there is an issue with committing or rolling back transactions.
 */
public class CheckedExceptions {
    // Method that throws IOException
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    // Method that throws SQLException
    public static void queryDatabase(String url, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM my_table");
        while (resultSet.next()) {
            System.out.println("Column 1: " + resultSet.getString(1));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public static void main(String[] args) {
        // Handle IOException
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // Handle SQLException
        String url = "jdbc:mysql://localhost:3306/my_database";
        String user = "root";
        String password = "password";

        try {
            queryDatabase(url, user, password);
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}
