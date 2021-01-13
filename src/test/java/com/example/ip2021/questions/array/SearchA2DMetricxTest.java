package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMetricxTest {

    SearchA2DMetricx searchA2DMetricx = new SearchA2DMetricx();

    @BeforeEach
    void setUp() {
    }

    @Test
    void searchMatrix() {
        int[][] arrray = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = -3;
        System.out.println(searchA2DMetricx.searchMatrix(arrray, target));

    }
}