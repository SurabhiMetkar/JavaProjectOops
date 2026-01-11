package org.example;
import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check length
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

}
