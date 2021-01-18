package com.example.ip2021.questions.dp;

/**
 * https://leetcode.com/problems/majority-element/
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return Integer.MAX_VALUE;
        }

        int count = 1, elem = nums[0];

        for (int i = 1; i < length ; i++) {
            if (nums[i] == elem) {
                count += 1;
            } else {
                count -= 1;
                if (count == 0) {
                    count = 1;
                    elem = nums[i];
                }
            }
        }

        int numCount = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == elem) {
                numCount += 1;
            }
        }

        return  numCount >= length/2 ? elem : Integer.MAX_VALUE;

    }
}
