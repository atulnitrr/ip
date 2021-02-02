package com.example.ip2021.questions.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-partitioning/
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
 * <p>
 * A palindrome string is a string that reads the same backward as forward.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 * Example 2:
 * <p>
 * Input: s = "a"
 * Output: [["a"]]
 */
public class PalindromePartioning {


    public List<List<String>> partition(String s) {
        final List<List<String>> result = new ArrayList<>();
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        fillDp(s, length, dp);

        for (int i = 0; i <length ; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        getResult(s, dp, result, new ArrayList<>(), 0);
        return result;
    }

    private void getResult(String s, boolean[][] dp, List<List<String>> result, List<String> current, int index) {

        int length = s.length();
        if (index > length) {
            return;
        }
        if (index == length) {
            result.add(new ArrayList<>(current));
            return;
        }


    }

    private void fillDp(String s, int length, boolean[][] dp) {
        for (int len = 1; len <= length; len++) {
            for (int i = 0; i <= length - len; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else if (len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
            }

        }
    }
}