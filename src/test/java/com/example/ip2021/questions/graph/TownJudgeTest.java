package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TownJudgeTest {


    TownJudge townJudge = new TownJudge();

    @BeforeEach
    void setUp() {
    }

    @Test
    void findJudge() {
        int[][] data = {
                {1, 3}, {2, 3}
        };
        int N = 3;
        System.out.println(townJudge.findJudge(N, data));
    }


    @Test
    void findJudge_334() {
        int[][] data = {
                {1, 3}, {2, 3}, {3, 1}
        };
        int N = 3;
        System.out.println(townJudge.findJudge(N, data));
    }
}