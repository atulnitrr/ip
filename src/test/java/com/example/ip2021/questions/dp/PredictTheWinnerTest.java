package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredictTheWinnerTest {
    
    PredictTheWinner predictTheWinner = new PredictTheWinner();

    @Test
    void test_Data() {
        int[] nums = {1, 5, 2};
        System.out.println(predictTheWinner.PredictTheWinner(nums));
    }

    @Test
    void test_Data_34() {
        int[] nums = {1, 5, 233, 7};
        System.out.println(predictTheWinner.PredictTheWinner(nums));
    }

    @Test
    void test_Data_35() {
        int[] nums = {1, 1};
        System.out.println(predictTheWinner.PredictTheWinner(nums));
    }
}