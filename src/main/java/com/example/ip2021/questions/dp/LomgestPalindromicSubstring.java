package com.example.ip2021.questions.dp;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 *
 */
public class LomgestPalindromicSubstring {


    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0) {
            return "";
        }
        int maxLen = 1;
        String result = s.substring(0,1);
        boolean[][] dp = new boolean[length][length];

        for (int l = 1; l <= length ; l++) {
            for (int i = 0; i <= length -l ; i++) {
                int j = i + l -1;
                if (l ==1 ) {
                    dp[i][j] = true;
                } else if (l == 2) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else  {
                    dp[i][j] = (   dp[i+1][j-1]  && s.charAt(i) == s.charAt(j));
                }

                if (dp[i][j] && maxLen < l) {
                    maxLen = l;
                    result = s.substring(i, j +1);
                }
            }

        }
        return result;
    }
}
