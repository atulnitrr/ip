package com.example.ip2021.questions.dp;

import java.util.Arrays;

public class House_Robber_2 {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }

        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] data = new int[length];
        Arrays.fill(data, -1);
        int value1 = helper(nums, data, 0, length-2);
        System.out.println(Arrays.toString(data));
        Arrays.fill(data, -1);
        int value2 = helper(nums, data, 1, length-1);
        System.out.println(Arrays.toString(data));
        return Math.max(value1, value2);
    }

    private int helper(int[] nums, int[] data, int low, int high) {
        if (low > high) {
            return 0;
        }

        if (data[low] != -1) {
            return data[low];
        }
        data[low] = Math.max(nums[low] + helper(nums, data, low +2, high) , helper(nums, data, low +1, high) );
        return data[low];
    }
}