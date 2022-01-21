package com.example.ip2021.questions.dp;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://leetcode.com/problems/generate-parentheses/
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 *
 * Input: n = 1
 * Output: ["()"]
 */
public class GenerateParen {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        if (n <= 0) {
            return ans;
        }
        generate(ans, 0, 0, n, "");
        return ans;

    }

    private void generate(List<String> ans, int open, int close, int n, String currentString) {
        if (currentString.length() == 2 * n) {
            ans.add(currentString);
            return;
        }

        if (open < n) {
            generate(ans, open + 1, close, n, currentString + "(");
        }
        if (close < open) {
            generate(ans, open, close +1, n, currentString + ")");
        }
    }
}