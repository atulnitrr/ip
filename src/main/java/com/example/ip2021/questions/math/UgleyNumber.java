package com.example.ip2021.questions.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/ugly-number/
 * Write a program to check whether a given number is an ugly number.
 *
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 *
 * Example 1:
 *
 * Input: 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * Example 2:
 *
 * Input: 8
 * Output: true
 * Explanation: 8 = 2 × 2 × 2
 * Example 3:
 *
 * Input: 14
 * Output: false
 * Explanation: 14 is not ugly since it includes another prime factor 7.
 */
public class UgleyNumber {

    public boolean isUgly(int num) {
        if (num < 2) {
            return false;
        }
        if (num <= 5) {
            return true;
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(2,3, 5));

        for (int i = 3; i <= num; i = i+2) {
            if ( num % i == 0 && !set.contains(i)) {
                return false;
            }
        }

        return true;

    }
}