package com.example.ip2021.questions.bits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Count_All_BitsTest {

    Count_All_Bits count_all_bits = new Count_All_Bits();

    @BeforeEach
    void setUp() {
        
    }

    @Test
    void test_11() {
        System.out.println(Arrays.toString(count_all_bits.countBits(3)));
    }

    @Test
    void test_13() {
        System.out.println(Arrays.toString(count_all_bits.countBits(15)));
    }
}