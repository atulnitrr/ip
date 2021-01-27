package com.example.ip2021.questions.dp;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-string-chain/
 * Given a list of words, each word consists of English lowercase letters.
 *
 * Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2.  For example, "abc" is a predecessor of "abac".
 *
 * A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.
 *
 * Return the longest possible length of a word chain with words chosen from the given list of words.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["a","b","ba","bca","bda","bdca"]
 * Output: 4
 * Explanation: One of the longest word chain is "a","ba","bda","bdca".
 * Example 2:
 *
 * Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
 */
public class LongestStringChain {

    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(words));
        int length = words.length;
        int[] dp = new int[length];
        dp[0] = 1;
        int maxvalue = 1;
        for (int i = 1; i < length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (canMake(words[i], words[j]) ) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            maxvalue = Math.max(maxvalue, dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        return maxvalue;
    }

    public boolean canMake(final String target, final String source) {
        int targetLength = target.length();
        int sourceLength = source.length();

        if (targetLength -1 != sourceLength  ) {
            return false;
        }
        int p1 = 0, p2 = 0;
        boolean found = false;
        while ( p1 < sourceLength) {
            if (source.charAt(p1) == target.charAt(p2)) {
                p1++;
            } else {
                if (found) {
                    return false;
                }
                found = true;
            }
            p2++;
        }
        return true;
    }
 }