package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainWaterTest {


    @Test
    void test_1() {
        RainWater rainWater = new RainWater();
        int[] height = {4,2,0,3,2,5};
        System.out.println(rainWater.trap(height));

     }

     @Test
    void test_2() {
        RainWater rainWater = new RainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainWater.trap(height));

     }
     @Test
     void test_5() {
        RainWater rainWater = new RainWater();
        int[] height = {3, 2, 1, 2, 3};
        System.out.println(rainWater.trap(height));

     }
}