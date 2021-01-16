package com.example.ip2021.questions.dp;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 * <p>
 * Input: [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
public class MaxProductSubarray {

    public int maxProduct(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        int prevMax = nums[0];
        int prevMin = nums[0];
        int overAllMax = nums[0];

        for (int i = 1; i < length; i++) {
            int temp = prevMax;
            prevMax = Math.max(nums[i], Math.max(prevMax * nums[i], prevMin * nums[i]));
            prevMin = Math.min(nums[i], Math.min(temp * nums[i], prevMin * nums[i]));
            overAllMax = Math.max(overAllMax, prevMax);
        }

        return overAllMax;
    }
}
