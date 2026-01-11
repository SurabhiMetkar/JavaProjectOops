package org.example;

public class Problem2 {
    public static void main(String[] args) {

        String input = "Hello123@Everyone!";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is an alphabet
            if (Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println("String: " + input);
        System.out.println("Number of alphabetic characters: " + count);
    }
}
