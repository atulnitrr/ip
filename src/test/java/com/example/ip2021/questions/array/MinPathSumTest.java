package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPathSumTest {

    MinPathSum minPathSum = new MinPathSum();

    @BeforeEach
    void setUp() {
    }

    @Test
    void minPathSum() {
        int[][] data = {
                {1,8,9},
                {13,5,6}
        };
        System.out.println(minPathSum.minPathSum(data));
    }
}