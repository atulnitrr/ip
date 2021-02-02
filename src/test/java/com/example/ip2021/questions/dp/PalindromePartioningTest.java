package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartioningTest {

    PalindromePartioning palindromePartioning = new PalindromePartioning();


    @Test
    void tets_1() {

        final String s = "abaabc";
        System.out.println(palindromePartioning.partition(s));
    }
}