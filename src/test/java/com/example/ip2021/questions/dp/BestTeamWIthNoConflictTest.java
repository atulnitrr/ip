package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTeamWIthNoConflictTest {

    BestTeamWIthNoConflict bestTeamWIthNoConflict;
    @BeforeEach
    void setUp() {
        bestTeamWIthNoConflict = new BestTeamWIthNoConflict();
    }

    @Test
    void bestTeamScore() {
        int[] scores = {4,5,6,5};
        int[] age = {2,1,2,1};
        System.out.println(bestTeamWIthNoConflict.bestTeamScore(scores, age));
    }

    @Test
    void bestTeamScore_2() {
        int[] scores = {1,3,5,10,15};
        int[] age = {1,2,3,4,5};
        System.out.println(bestTeamWIthNoConflict.bestTeamScore(scores, age));
    }

    @Test
    void bestTeamScore_3() {
        int[] scores = {1,2,3,5};
        int[] age = {8,9,10,1};
        System.out.println(bestTeamWIthNoConflict.bestTeamScore(scores, age));
    }
}