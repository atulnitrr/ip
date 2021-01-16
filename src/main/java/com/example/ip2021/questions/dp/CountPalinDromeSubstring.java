package com.example.ip2021.questions.dp;


/**
 * https://leetcode.com/problems/palindromic-substrings/
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 *
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2:
 *
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */
public class CountPalinDromeSubstring {

    public int countSubstrings(String s) {
        int len = s.length();
        int count = 0;
        boolean dp[][] = new boolean[len][len];

        for (int l = 1; l <= len; l++) {
            for (int i = 0; i <= len - l ; i++) {
                int j = i + l - 1;
                if (l == 1) {
                    dp[i][j] = true;
                } else if (l == 2 ) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i+1][j-1];
                }

                if (dp[i][j]) {
                    count += 1;
                }
            }

        }
        return count;

    }
}
