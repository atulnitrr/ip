package com.example.ip2021.questions.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void maxAreaBrute() {
        final int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxAreaBrute(height));

    }

    @Test
    void maxAreaBrute2() {
        final int[] height = {9,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxAreaBrute(height));

    }

    @Test
    void maxAreaBrute3() {
        final int[] height = {2,8,6,2,5,4,8,3,2};
        System.out.println(containerWithMostWater.maxAreaBrute(height));

    }

    @Test
    void maxAreaOptimized() {
        final int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxAreaBrute(height));
    }
    @Test
    void maxAreaOptimized2() {
        final int[] height = {9,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxAreaBrute(height));
    }

    @Test
    void maxAreaOptimized3() {
        final int[] height = {2,8,6,2,5,4,8,3,2};
        System.out.println(containerWithMostWater.maxAreaBrute(height));
    }
}