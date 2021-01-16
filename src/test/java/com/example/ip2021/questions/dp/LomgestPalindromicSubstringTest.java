package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 *
 */
class LomgestPalindromicSubstringTest {

    LomgestPalindromicSubstring lomgestPalindromicSubstring = new LomgestPalindromicSubstring();

    @BeforeEach
    void setUp() {
    }

    @Test
    void longestPalindrome() {
        final String s = "babad";
        System.out.println(lomgestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_34() {
        final String s = "cbbd";
        System.out.println(lomgestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_35() {
        final String s = "ac";
        System.out.println(lomgestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_65() {
        final String s = "c";
        System.out.println(lomgestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_55() {
        final String s = "";
        System.out.println(lomgestPalindromicSubstring.longestPalindrome(s));
    }
}