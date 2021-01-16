package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    LongestCommonSubsequence longestCommonSubsequence ;

    @BeforeEach
    void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    void longestCommonSubsequence() {

        String text1 = "ab";
        String text2 = "cdamb";
        System.out.println(longestCommonSubsequence.longestCommonSubsequence(text1, text2));

    }
}