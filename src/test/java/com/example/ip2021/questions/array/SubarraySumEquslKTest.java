package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEquslKTest {

    SubarraySumEquslK subarraySumEquslK = new SubarraySumEquslK();

    @BeforeEach
    void setUp() {
    }

    @Test
    void testData() {
        int nums[] = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySumEquslK.subarraySum(nums, k));
    }

    @Test
    void testData3() {
        int nums[] = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySumEquslK.subarraySum(nums, k));
    }

    @Test
    void testData5() {
        int nums[] = {1, -1, 0};
        int k = 0;
        System.out.println(subarraySumEquslK.subarraySum(nums, k));
    }

    @Test
    void testData6() {
        int nums[] = {1};
        int k = 1;
        System.out.println(subarraySumEquslK.subarraySum(nums, k));
    }
}