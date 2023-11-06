package io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Objects {
        public static void main(String[] args) {
            // The string you want to write to the file
            String content = "districts.txt";

            // Specify the file path where you want to write the content
            String filePath = "output.txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                // Write the content to the file
                writer.write(content);

                System.out.println("Content has been written to the file successfully.");
            } catch (IOException e) {
                // Handle any potential IOException that might occur
                System.err.println("Error writing to the file: " + e.getMessage());
            }
        }
    }


