package com.example.ip2021.questions.array;

public class ConcatArray {

    public int[] getAns(final int[] nums) {

        int len = nums.length;
        int[] ans = new int[2*len];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % len];
        }

        return ans;

    }
}