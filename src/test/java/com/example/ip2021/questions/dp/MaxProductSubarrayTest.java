package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductSubarrayTest {

    MaxProductSubarray maxProductSubarray = new MaxProductSubarray();

    @BeforeEach
    void setUp() {
    }

    @Test
    void maxProduct() {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProductSubarray.maxProduct(nums));
    }

    @Test
    void maxProduct_33() {
        int[] nums = {-2,0,-1};
        System.out.println(maxProductSubarray.maxProduct(nums));
    }

    @Test
    void maxProduct_32() {
        int[] nums = {0,0,0};
        System.out.println(maxProductSubarray.maxProduct(nums));
    }

    @Test
    void maxProduct_35() {
        int[] nums = {1, 2, 3
        };
        System.out.println(maxProductSubarray.maxProduct(nums));
    }

}