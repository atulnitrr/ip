package com.example.ip2021.questions.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UgleyNumberTest {

    UgleyNumber ugleyNumber = new UgleyNumber();

    @Test
    void tes_2() {

        int num = 34;
        System.out.println(ugleyNumber.isUgly(num));
    }
}