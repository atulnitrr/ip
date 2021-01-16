package com.example.ip2021.questions.dp;

/**
 * https://leetcode.com/problems/longest-palindromic-subsequence/submissions/
 * Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 * Input:
 *
 * "bbbab"
 * Output:
 * 4
 * One possible longest palindromic subsequence is "bbbb".
 */
public class LongestPalindromeSubsequence {

    public int longestPalindromeSubseq(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int dp[][] = new int[length][length];

        for (int l = 1; l <= length ; l++) {
            for (int i = 0; i <= length -l ; i++) {
                int j = i + l -1;
                if (l == 1) {
                    dp[i][j]  = 1;
                } else if (l == 2) {
                    // remember this , this is must
                    dp[i][j] =  ( s.charAt(i) == s.charAt(j)) ? 2 : 1;
                } else {
                    int current = (s.charAt(i) == s.charAt(j)) ? 2 : 0;
                    dp[i][j] = Math.max(current + dp[i+1][j-1], Math.max(dp[i+1][j], dp[i][j-1]));
                }
            }
        }
        return dp[0][length-1];
    }

}
