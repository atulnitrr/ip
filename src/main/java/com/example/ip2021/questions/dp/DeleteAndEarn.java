package com.example.ip2021.questions.dp;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/delete-and-earn/
 * Given an array nums of integers, you can perform operations on the array.
 *
 * In each operation, you pick any nums[i] and delete it to earn nums[i] points. After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.
 *
 * You start with 0 points. Return the maximum number of points you can earn by applying such operations.
 *
 * Example 1:
 *
 * Input: nums = [3, 4, 2]
 * Output: 6
 * Explanation:
 * Delete 4 to earn 4 points, consequently 3 is also deleted.
 * Then, delete 2 to earn 2 points. 6 total points are earned.
 *
 *
 * Example 2:
 *
 * Input: nums = [2, 2, 3, 3, 3, 4]
 * Output: 9
 * Explanation:
 * Delete 3 to earn 3 points, deleting both 2's and the 4.
 * Then, delete 3 again to earn 3 points, and 3 again to earn 3 points.
 * 9 total points are earned.
 */
public class DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        int length = nums.length;

        switch (length) {
            case 0:
                return 0;
            case 1:
                return nums[0];
        }

        int maxValue = findMax(nums);
        int[] currentData = new int[maxValue +1];
        int[] dp = new int[maxValue +1];

        for (Integer num : nums) {
            currentData[num] += num;
        }

        dp[0] = currentData[0];
        dp[1] = currentData[1];
        dp[2] = Math.max(currentData[1], currentData[2]);
        for (int i = 3; i <= maxValue; i++) {
            dp[i] = Math.max( dp[i-1],  currentData[i] + dp[i-2]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[maxValue];
    }

    private int findMax(int[] nums) {
        int maxValue = nums[0];
        for (Integer num : nums) {
            maxValue = Math.max(maxValue, num);
        }
          return maxValue;
    }
}