package com.sparta.mnm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    @Test
    @DisplayName("1")
    public void reverseWordKayak(){
        Assertions.assertEquals("kayak",App.reverseWord("kayak"));
    }

    @Test
    @DisplayName("2")
    public void checkPalindromeKayak(){
        Assertions.assertEquals(true,App.isPalindrome("kayak"));
    }

    @Test
    @DisplayName("3")
    public void checkPalindromeKayakCaps(){
        Assertions.assertEquals(true,App.isPalindrome("KAyAk"));
    }

    @Test
    @DisplayName("4")
    public void checkPalindromeRandom(){
        Assertions.assertEquals(false,App.isPalindrome("random"));
    }

    @Test
    @DisplayName("5")
    public void reverseWordKayakCaps(){
        Assertions.assertEquals("KAyak",App.reverseWord("kayAK"));
    }

    @Test
    @DisplayName("6")
    public void reverseFindLongest(){
        Assertions.assertEquals("level",App.findLongest("Level and Kayak."));
    }

    @Test
    @DisplayName("7")
    public void reverseFindLongestDoesNotExist(){
        Assertions.assertEquals("No Palindrome found",App.findLongest("This is so cool"));
    }

    @Test
    @DisplayName("8")
    public void reverseFindLongestA(){
        Assertions.assertEquals("No Palindrome found",App.findLongest("a loop for a"));
    }

    @Test
    @DisplayName("9")
    public void reverseFindLongestSai(){
        Assertions.assertEquals("saippuakivikauppias",App.findLongest("Level loop for saippuakivikauppias"));
    }

    @Test
    @DisplayName("10")
    public void reverseA(){
        Assertions.assertEquals("a",App.reverseWord("a"));
    }
}