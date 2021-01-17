package com.example.ip2021.questions.dp;

/**
 * https://leetcode.com/problems/2-keys-keyboard/
 * Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:
 *
 * Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
 * Paste: You can paste the characters which are copied last time.
 *
 *
 * Given a number n. You have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 3
 * Explanation:
 * Intitally, we have one character 'A'.
 * In step 1, we use Copy All operation.
 * In step 2, we use Paste operation to get 'AA'.
 * In step 3, we use Paste operation to get 'AAA'.
 */
public class Keyboard {

    public int minStepsDP(int n) {

        if (n <= 1) {
            return 0;
        }

        int[] dp = new int[n+1];

        for (int i = 2; i <= n ; i++) {
            int minValue = i;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    minValue = Math.min(minValue, Math.min(dp[j] + (i/j), dp[i/j] + j  ));
                }
            }
            dp[i] = minValue;
        }
        return dp[n];
    }

    public int minSteps(int n) {
        if(n == 1) return 0;
        int cache = 1,cur = 1,result = 0;
        while(cur < n) {
            System.out.println(cur + " " + cache + " " + result);
            if(n % cur == 0) {
                cache = cur;
                cur *= 2;
                result += 2;
            }else {
                cur += cache;
                result++;
            }
            System.out.println(cur + " " + cache + " " + result);
            System.out.println("-----");
        }
        return result;
    }
}
