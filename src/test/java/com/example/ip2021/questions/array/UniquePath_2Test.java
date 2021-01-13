package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePath_2Test {

    UniquePath_2 uniquePath_2 = new UniquePath_2();

    @BeforeEach
    void setUp() {
    }

    @Test
    void uniquePathsWithObstacles() {
        int[][] data = {
                {0, 0},
                {0, 0}
        };
        System.out.println(uniquePath_2.uniquePathsWithObstacles(data));
    }

    @Test
    void uniquePathsWithObstacles3() {
        int[][] data = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 1},
        };
        System.out.println(uniquePath_2.uniquePathsWithObstacles(data));
    }
}