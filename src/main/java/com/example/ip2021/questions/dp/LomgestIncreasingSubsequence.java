package com.example.ip2021.questions.dp;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Example 2:
 *
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 */
public class LomgestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        int maxLen = 1;

        for (int i = 1; i < length; i++) {
            for (int j = 0  ; j < i ; j++) {
                if ( nums[i] > nums[j]  && dp[i] < dp[j] +1) {
                    dp[i] = dp[j] + 1;
                }
            }

            if (maxLen < dp[i]) {
                maxLen = dp[i];
            }
        }
       return maxLen;
    }

}