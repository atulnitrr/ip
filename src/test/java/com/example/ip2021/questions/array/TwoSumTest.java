package com.example.ip2021.questions.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    void test1() {
        int[] nums = {2, 7, 9, 6};
        int target = 9;
        System.out.println(Arrays.toString( twoSum.twoSum(nums, 9)));
    }

    @Test
    void test3() {
        int[] nums = {2, 9, 6, 7};
        int target = 9;
        System.out.println(Arrays.toString( twoSum.twoSum(nums, 9)));
    }

    @Test
    void test5() {
        int[] nums = {2, 9, 7, 6};
        int target = 9;
        System.out.println(Arrays.toString( twoSum.twoSum(nums, 9)));
    }
}