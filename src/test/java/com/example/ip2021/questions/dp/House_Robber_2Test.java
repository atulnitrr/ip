package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class House_Robber_2Test {

    House_Robber_2 house_robber_2;
    @BeforeEach
    void setUp() {
        house_robber_2 = new House_Robber_2();
    }

    @Test
    void test_1() {
        int[] nums = {2, 3, 2, 5, 6};
        System.out.println(house_robber_2.rob(nums));
    }

    @Test
    void test_3() {
        int[] nums = {2, 3, 2};
        System.out.println(house_robber_2.rob(nums));
    }
}