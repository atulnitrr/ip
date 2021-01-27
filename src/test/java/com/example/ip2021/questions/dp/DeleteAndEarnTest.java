package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteAndEarnTest {

    DeleteAndEarn deleteAndEarn;

    @BeforeEach
    void setUp() {
        deleteAndEarn = new DeleteAndEarn();
    }

    @Test
    void deleteAndEarn() {
        int[] nums = {3, 4, 2};
        System.out.println(deleteAndEarn.deleteAndEarn(nums));
    }

    @Test
    void deleteAndEarn_2() {
        int[] nums = {2, 2, 3, 3, 3, 4};
        System.out.println(deleteAndEarn.deleteAndEarn(nums));
    }
}