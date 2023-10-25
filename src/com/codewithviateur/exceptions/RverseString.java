package com.codewithviateur.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RverseString{
    public static void main(String[] args) {
        String inputFile = "java.txt"; // Input file name
        String outputFile = "reversed.txt"; // Output file name

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }

            String[] sentences = content.toString().split("[.!?]\\s*");
            for (String sentence : sentences) {
                String reversedSentence = reverseSentence(sentence);
                bw.write(reversedSentence);
                bw.newLine();
            }
            System.out.println("Sentences reversed and saved in reversed.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String reverseSentence(String sentence) {
        // Remove leading and trailing whitespace from the sentence
        sentence = sentence.trim();

        // Reverse the sentence
        StringBuilder reversedSentence = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        // Capitalize the first letter of the reversed sentence
        reversedSentence.setCharAt(0, Character.toUpperCase(reversedSentence.charAt(0)));

        // Add period at the end of the reversed sentence
        reversedSentence.append('.');
        return reversedSentence.toString();
    }
}
