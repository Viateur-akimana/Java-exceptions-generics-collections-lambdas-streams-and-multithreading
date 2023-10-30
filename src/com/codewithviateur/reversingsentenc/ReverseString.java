package com.codewithviateur.reversingsentenc;

import java.io.*;

public class ReverseString {
    public static void main(String[] args) {
        String inputFile = "/home/akimana/IdeaProjects/Advanced concepts/src/com/codewithviateur/reversingsentenc/java.txt";
        String outputFile = "reversed.txt";

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
            System.out.println("Sentences and words reversed and saved in reversed.txt.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please check the file path: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String reverseSentence(String sentence) {
        sentence = sentence.trim();

        StringBuilder reversedWords = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(reverseWord(words[i])).append(" ");
        }
        reversedWords.setCharAt(0, Character.toUpperCase(reversedWords.charAt(0)));

        reversedWords.append('.');
        return reversedWords.toString();
    }

    private static String reverseWord(String word) {
        // Reverse a single word
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}
