package com.example.ip2021.questions.bits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Count_1_bitsTest {


    Count_1_bits count_1_bits;
    @BeforeEach
    void setUp() {

        count_1_bits = new Count_1_bits();
    }

    @Test
    void test_1() {

        int mask = 1;
        for (int i = 0; i < 32; i++) {
            System.out.println( i + " ->> " + ( mask ));
            mask <<= 1;
        }
    }

    @Test
    void test_2() {
        System.out.println(count_1_bits.hammingWeight(23));
    }
}