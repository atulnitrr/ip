package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstring2Test {

    LongestPalindromicSubstring2 palindromicSubstring2 = new LongestPalindromicSubstring2();

    @Test
    void test1() {
        String s = "babad";
        System.out.println(palindromicSubstring2.longestPalindrome(s));
    }
}