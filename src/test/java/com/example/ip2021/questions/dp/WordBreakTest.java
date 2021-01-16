package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


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

class WordBreakTest {

    WordBreak wordBreak = new WordBreak();

    @BeforeEach
    void setUp() {
    }

    @Test
    void wordBreak() {
        String string = "abced";
        List<String> stringList = Arrays.asList("db", "mm");
        boolean db = stringList.contains("Db");
        System.out.println(db);
        String substring = string.substring(0, 2);
        System.out.println(substring);
    }

    @Test
    void testData() {
        final String s = "leetcode";
        final List<String> list = Arrays.asList("leet", "code");
        System.out.println(wordBreak.wordBreak(s, list));
    }
}