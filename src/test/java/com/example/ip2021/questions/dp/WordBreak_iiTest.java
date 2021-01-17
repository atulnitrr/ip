package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
class WordBreak_iiTest {

    WordBreak_ii wordBreak_ii = new WordBreak_ii();
    @BeforeEach
    void setUp() {
    }

    @Test
    void wordBreak() {

        List<String> wordDir = Arrays.asList("cat", "cats", "and", "sand", "dog");
        final String ss = "catsanddog";
        List<String> stringList = wordBreak_ii.wordBreak(ss, wordDir);
        System.out.println(stringList);
    }




    @Test
    void wordBreak_6() {

        List<String> wordDir = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        final String ss = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        List<String> stringList = wordBreak_ii.wordBreak(ss, wordDir);
        System.out.println(stringList);
    }


    @Test
    void wordBreak_4() {

        List<String> wordDir = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        final String ss = "pineapplepenapple";
        List<String> stringList = wordBreak_ii.wordBreak(ss, wordDir);
        System.out.println(stringList);
    }
}