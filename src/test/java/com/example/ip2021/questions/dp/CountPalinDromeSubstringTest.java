package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPalinDromeSubstringTest {

    CountPalinDromeSubstring countPalinDromeSubstring = new CountPalinDromeSubstring();

    @BeforeEach
    void setUp() {
    }

    @Test
    void countSubstrings() {
        final String s = "aaa";
        System.out.println(countPalinDromeSubstring.countSubstrings(s));
    }
}