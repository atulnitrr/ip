package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LomgestIncreasingSubsequenceTest {

    LomgestIncreasingSubsequence longestCommonSubsequence = new LomgestIncreasingSubsequence();

    @BeforeEach
    void setUp() {
    }


    @Test
    void test_1() {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(longestCommonSubsequence.lengthOfLIS(nums));
    }

    @Test
    void test_2() {
        int[] nums = {0,1,0,3,2,3};
        System.out.println(longestCommonSubsequence.lengthOfLIS(nums));
    }

    @Test
    void test_4() {
        int[] nums = {7,7,7,7,7,7,7};
        System.out.println(longestCommonSubsequence.lengthOfLIS(nums));
    }
}