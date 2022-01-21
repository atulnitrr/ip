package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenTest {

    GenerateParen generateParen = new GenerateParen();

    @Test
    void tes1() {
        int n = 3;
        System.out.println(generateParen.generateParenthesis(n));
    }
}