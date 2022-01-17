package com.example.ip2021.questions.graph;

public class TownJudge_R {

    public int findJudge(int N, int[][] trust) {
        if (N == 1 && trust.length == 0) {
            return 1;
        }
        int[] inDegree = new int[N + 1];
        int[] outDegree = new int[N + 1];



        for (int i = 0; i < trust.length; i++) {
            inDegree[trust[i][1]]++;
            outDegree[trust[i][0]]++;

        }

        for (int i = 0; i < N + 1; i++) {
            if (inDegree[i] == N - 1 && outDegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}