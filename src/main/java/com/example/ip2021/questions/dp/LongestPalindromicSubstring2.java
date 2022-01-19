package com.example.ip2021.questions.dp;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 * Accepted
 * 1,641,817
 * Submissions
 * 5,193,395
 */
public class LongestPalindromicSubstring2 {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int stringLength = s.length();

        boolean[][] dp = new boolean[stringLength][stringLength];
        String ans = s.substring(0, 1);

        for (int len = 1; len <= stringLength; len++) {
            for (int i = 0; i <= stringLength - len; i++) {
                int j = i + len - 1;
                if (i == j) {
                    dp[i][j] = true;
                } else if (j == i + 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                }

                if (dp[i][j]) {
                    ans = s.substring(i, j + 1);
                }

            }
        }


        for (int i = 0; i < stringLength; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return ans;

    }
}