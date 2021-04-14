package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TownJudge_RTest {

    TownJudge_R townJudge_r = new TownJudge_R();

    @Test
    void test_23() {
        int[][] data = {{ 1, 2} };
        int n = 2;
        System.out.println(townJudge_r.findJudge(n, data));
    }

    @Test
    void test_235() {
        int[][] data = {{ 1, 3}, { 2, 3} };
        int n = 3;
        System.out.println(townJudge_r.findJudge(n, data));
    }

    @Test
    void test_2355() {
        int[][] data = {{ 1, 3}, { 2, 3}, {3, 1} };
        int n = 3;
        System.out.println(townJudge_r.findJudge(n, data));
    }

    @Test
    void test_2355_tt() {
        int[][] data = {{ 1, 2}, { 2, 3} };
        int n = 3;
        System.out.println(townJudge_r.findJudge(n, data));
    }

    @Test
    void test_2355_ttrr() {
        int[][] data = {{ 1, 2}, { 2, 3} };
        int n = 3;
        System.out.println(townJudge_r.findJudge(n, data));
    }


}