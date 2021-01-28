package com.example.ip2021.questions.dp;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/predict-the-winner/
 * Given an array of scores that are non-negative integers. Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on. Each time a player picks a number, that number will not be available for the next player. This continues until all the scores have been chosen. The player with the maximum score wins.
 * <p>
 * Given an array of scores, predict whether player 1 is the winner. You can assume each player plays to maximize his score.
 * <p>
 * Example 1:
 * <p>
 * Input: [1, 5, 2]
 * Output: False
 * Explanation: Initially, player 1 can choose between 1 and 2.
 * If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2).
 * So, final score of player 1 is 1 + 2 = 3, and player 2 is 5.
 * Hence, player 1 will never be the winner and you need to return False.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: [1, 5, 233, 7]
 * Output: True
 * Explanation: Player 1 first chooses 1. Then player 2 have to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.
 * Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.
 */
public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        int length = nums.length;
        if (length <=1 ) {
            return true;
        }

        int[][] dp = new int[length][length];
        int sum = Arrays.stream(nums).sum();
        for (int len = 1; len <= length; len++) {
            for (int i = 0; i <= length - len ; i++) {
                int j = i + len -1;
                if (len == 1) {
                    dp[i][j] = nums[i];
                } else if (len == 2) {
                    dp[i][j] = Math.max(nums[i], nums[j]);
                } else {
                    int x = i + 2 <= j ? dp[i+2][j] : 0;
                    int y = i + 1 <= j-1 ? dp[i + 1][j-1] : 0;
                    int z = i <= j-2 ? dp[i][j-2] : 0;
                    int firstValue = nums[i] + Math.min(x, y);
                    int secondValue = nums[j] +  Math.min( y, z);
                    dp[i][j] = Math.max(firstValue, secondValue);
                }
            }

        }

        return dp[0][length -1] >= (sum -  dp[0][length -1]) ;
    }
    public boolean PredictTheWinner_du(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length][length];

        for (int len = 1; len <= length; len++) {
            for (int i = 0; i <= length - len; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = nums[i];
                } else if (len == 2) {
                    dp[i][j] = Math.max(nums[i], nums[i + 1]);
                } else {
                    int datai1j1 = i + 1 <= j - 1 ? dp[i + 1][j - 1] : 0;
                    int datai1j2 = i + 2 <= j ? dp[i + 2][j] : 0;
                    int dataij2 = i <= j - 2 ? dp[i][j - 2] : 0;
                    int valu1 = nums[i] + Math.min(datai1j1, datai1j2);
                    int value2 = nums[j] + Math.min(dataij2, datai1j1);
                    dp[i][j] = Math.max(valu1, value2);
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return false;
    }
}