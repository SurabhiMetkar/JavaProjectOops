package org.example;

public class Problem7 {
    // Method to count words in a string
    public static int countWords(String input) {

        // Remove leading/trailing spaces
        input = input.trim();

        // If string is empty, return 0
        if (input.isEmpty()) {
            return 0;
        }

        // Split the string using spaces or punctuation as separators
        String[] words = input.split("[\\s\\p{Punct}]+");

        return words.length;
    }

    public static void main(String[] args) {

        String text = "Hello, world!";
        int wordCount = countWords(text);

        System.out.println("Number of words: " + wordCount);

    }
}