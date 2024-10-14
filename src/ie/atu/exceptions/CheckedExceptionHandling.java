package ie.atu.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt"); // This line may throw IOException
            System.out.println("File opened successfully");
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
