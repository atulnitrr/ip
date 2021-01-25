package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourceShcedule_1Test {

    CourceShcedule_1 courceShcedule_1 = new CourceShcedule_1();

    @BeforeEach
    void setUp() {
    }

    @Test
    void test_data() {
        int n = 2;
        int[][] data = { {1, 0}};
        System.out.println(courceShcedule_1.canFinish(n, data));
    }

    @Test
    void test_data_33() {
        int n = 2;
        int[][] data = { {1, 0}, {0, 1}};
        System.out.println(courceShcedule_1.canFinish(n, data));
    }
}