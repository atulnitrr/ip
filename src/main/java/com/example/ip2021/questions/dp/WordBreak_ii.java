package com.example.ip2021.questions.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/word-break-ii/
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.
 *
 * Note:
 *
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * Example 1:
 *
 * Input:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * Output:
 * [
 *   "cats and dog",
 *   "cat sand dog"
 * ]
 * Example 2:
 *
 * Input:
 * s = "pineapplepenapple"
 * wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 * Output:
 * [
 *   "pine apple pen apple",
 *   "pineapple pen apple",
 *   "pine applepen apple"
 * ]
 * Explanation: Note that you are allowed to reuse a dictionary word.
 * Example 3:
 *
 * Input:
 * s = "catsandog"
 * wordDict = ["cats", "dog", "sand", "and", "cat"]
 * Output:
 * []
 */
public class WordBreak_ii {

    public List<String> wordBreak(String s, List<String> wordDict) {

        List<String> result = new ArrayList<>();
        if (s.length() == 0) {
            return  result;
        }
        int len = s.length();
        List<String> dp[] = new List[len];
        for (int i = 0; i < len; i++) {
            dp[i] = new ArrayList<>();
        }

        if (wordDict.contains(s.substring(0, 1))) {
            dp[0].add(s.substring(0, 1));
        }

        for (int i = 1; i < len ; i++) {
            if (wordDict.contains(s.substring(0, i +1))) {
                dp[i].add(s.substring(0, i+1));
            }

            for (int j = 0; j < i; j++) {
                List<String> stringList = dp[j];
                if (!stringList.isEmpty() && wordDict.contains( s.substring(j +1, i +1))) {
                    for (int k = 0; k < stringList.size(); k++) {
                        dp[i].add(stringList.get(k) + " " + s.substring( j+1, i +1));
                    }
                }

            }
        }

        return  dp[len-1];

    }

}
