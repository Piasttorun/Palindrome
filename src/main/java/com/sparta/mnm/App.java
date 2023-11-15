package com.sparta.mnm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        getSentence();
    }

    private static void getSentence() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter text:");

        String sentence = myObj.nextLine();
        System.out.println(findLongest(sentence));
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = 0; i < word.length(); i++) {
            reversed = word.charAt(i) + reversed;
        }
        return reversed;
    }

    public static boolean isPalindrome(String word) {
        boolean palindrome = false;
        word = word.replaceAll("\\p{Punct}", "");
        String reversedWord = reverseWord(word.toLowerCase());
        if (reversedWord.equals(word.toLowerCase())) {
            palindrome = true;
        }
        return palindrome;
    }

    public static boolean isPalindromeBuilder(String word) {
        boolean palindrome = false;
        word = word.replaceAll("\\p{Punct}", "");
        String reverse = new StringBuilder(word.toLowerCase()).reverse().toString();
        if (word.toLowerCase().equals(reverse)) {
            palindrome = true;
        }
        return palindrome;
    }

    public static String findLongest(String sentence) {
        int largestCurrentPalindromeLength = 0;
        String palindrome = "No Palindrome found";
        sentence = sentence.replaceAll("\\p{Punct}", "").toLowerCase();
        for (String word: sentence.split(" ")) {
            if (isPalindromeBuilder(word) && word.length() > 2 && word.length() > largestCurrentPalindromeLength) {
                palindrome = word;
                largestCurrentPalindromeLength = word.length();
            }
        }
        return palindrome;
    }
}