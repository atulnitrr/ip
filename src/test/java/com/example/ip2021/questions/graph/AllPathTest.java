package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllPathTest {

    AllPath allPath = new AllPath();

    @Test
    void test_Data() {
        int[][] graph = { { }, {}};
        allPath.allPathsSourceTarget(graph);
    }
}