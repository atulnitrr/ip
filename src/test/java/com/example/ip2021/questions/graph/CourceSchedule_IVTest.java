package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourceSchedule_IVTest {

    CourceSchedule_IV courceSchedule_iv = new CourceSchedule_IV();

    @BeforeEach
    void setUp() {
        
    }

    @Test
    void test_data() {
        int n = 2;
        int[][] prerequisites = {{1, 0}};
        int[][] queries = { { 0, 1} , {1, 0}};
        System.out.println(courceSchedule_iv.checkIfPrerequisite(n, prerequisites, queries));
    }
}