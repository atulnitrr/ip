package com.example.ip2021.questions.dp;

import java.util.*;

/**
 * https://leetcode.com/problems/best-team-with-no-conflicts/
 * You are the manager of a basketball team. For the upcoming tournament, you want to choose the team with the highest overall score. The score of the team is the sum of scores of all the players in the team.
 *
 * However, the basketball team is not allowed to have conflicts. A conflict exists if a younger player has a strictly higher score than an older player. A conflict does not occur between players of the same age.
 *
 * Given two lists, scores and ages, where each scores[i] and ages[i] represents the score and age of the ith player, respectively, return the highest overall score of all possible basketball teams.
 *
 *
 *
 * Example 1:
 *
 * Input: scores = [1,3,5,10,15], ages = [1,2,3,4,5]
 * Output: 34
 * Explanation: You can choose all the players.
 * Example 2:
 *
 * Input: scores = [4,5,6,5], ages = [2,1,2,1]
 * Output: 16
 * Explanation: It is best to choose the last 3 players. Notice that you are allowed to choose multiple people of the same age.
 * Example 3:
 *
 * Input: scores = [1,2,3,5], ages = [8,9,10,1]
 * Output: 6
 * Explanation: It is best to choose the first 3 players.
 */
public class BestTeamWIthNoConflict {


    public int bestTeamScore(int[] scores, int[] ages) {
        int maxValue = 0;
        List<Player> list = new ArrayList<>();
        int length = scores.length;
        if (length == 0) {
            return 0;
        }
        for (int i = 0; i < length; i++) {
            list.add( new Player(scores[i], ages[i]));
        }
        Collections.sort(list);
        int[] dp = new int[length];


        for (int i = 0; i < length ; i++) {
            dp[i] = list.get(i).score;
            for (int j = 0; j < i; j++) {
                if ( list.get(j).score <= list.get(i).score && dp[i] < dp[j] + list.get(i).score) {
                    dp[i] = dp[j] + list.get(i).score;
                }
            }
            maxValue = Math.max(maxValue, dp[i]);
        }
//        System.out.println(list);
//        System.out.println(Arrays.toString(dp));
        return maxValue;
    }

    class Player  implements Comparable<Player> {
        int score, age;
        public Player(int score, int age) {
            this.score = score;
            this.age = age;
        }

        @Override
        public int compareTo(Player o) {
            return this.age == o.age ? this.score - o.score : this.age - o.age;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "score=" + score +
                    ", age=" + age +
                    '}';
        }
    }

}