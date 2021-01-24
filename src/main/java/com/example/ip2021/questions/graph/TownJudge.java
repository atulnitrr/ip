package com.example.ip2021.questions.graph;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-town-judge/
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 * <p>
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 */
public class TownJudge {

    public int findJudge(int N, int[][] trust) {
        int length = trust.length;
        if (N == 1 && trust.length == 0) {
            return 1;
        }
        if (length == 0) {
            return -1;
        }
        int[] inDegree = new int[N + 1];

        for (int i = 0; i < trust.length; i++) {
            inDegree[trust[i][1]] += 1;
            inDegree[trust[i][0]] -= 1;
        }

        System.out.println(Arrays.toString(inDegree));
        for (int i = 1; i <= N ; i++) {
            if (inDegree[i] == N-1) {
                return i;
            }
        }
        return -1;
    }
}
