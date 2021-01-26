package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopoSortTest {

    TopoSort topoSort = new TopoSort();

    @BeforeEach
    void setUp() {
    }

    @Test
    void test_Data() {
        int n = 2;
        int[][] data = { {1, 0}};

        topoSort.topoSort(n, data);

    }

    @Test
    void test_Data_3() {
        int n = 2;
        int[][] data = { {1, 0}, {0, 1}};

        topoSort.topoSort(n, data);

    }

    @Test
    void test_Data_4() {
        int n = 3;
        int[][] data = { {0, 1}, {2, 1}};

        topoSort.topoSort(n, data);

    }
}