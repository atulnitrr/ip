package com.example.ip2021.questions.dp;

/**
 * https://leetcode.com/problems/trapping-rain-water/submissions/
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * Example 1:
 *
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 */
public class RainWater {


    public int trap(int[] height) {
        int water = 0;
        int len = height.length;
        if (len <= 2) {
            return water;
        }
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        leftMax[0] = height[0];
        rightMax[len - 1] = height[len -1];

        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        for (int i = rightMax.length - 2; i >= 0; i--) {
           rightMax[i] = Math.max(rightMax[i+1], height[i]);

        }

        for (int i = 0; i < len; i++) {
            int min = Math.min(leftMax[i], rightMax[i]);
            if (min !=  0) {
                water += (min - height[i]);
            }
         }

        return water;
    }
}