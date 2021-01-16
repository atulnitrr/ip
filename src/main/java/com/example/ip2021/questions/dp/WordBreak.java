package com.example.ip2021.questions.dp;

import java.util.List;

/**
 * https://leetcode.com/problems/word-break/
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * Note:
 *
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet", "code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple", "pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 *              Note that you are allowed to reuse a dictionary word.
 * Example 3:
 *
 * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * Output: false
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        int length = s.length();
        if (length == 0) {
            return false;
        }

        boolean dp[] = new boolean[length];

        dp[0] = wordDict.contains(s.substring(0, 1));

        for (int i = 1; i < length; i++) {
            if (wordDict.contains(s.substring(0, i + 1))) {
                dp[i] = true;
                continue;
            }

            for (int j = 0; j <= i - 1 ; j++) {
                if (dp[j] && wordDict.contains(s.substring(j+1, i +1))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length-1];
    }
}
