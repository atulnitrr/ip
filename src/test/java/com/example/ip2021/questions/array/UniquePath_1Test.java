package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePath_1Test {

    UniquePath_1 uniquePath_1 = new UniquePath_1();

    @BeforeEach
    void setUp() {
    }

    @Test
    void uniquePaths() {
        int m = 3;
        int n = 2;
        System.out.println(uniquePath_1.uniquePaths(m, n));
    }

    @Test
    void uniquePaths_3() {
        int m = 7;
        int n = 3;
        System.out.println(uniquePath_1.uniquePaths(m, n));
    }

    @Test
    void uniquePaths_4() {
        int m = 3;
        int n = 3;
        System.out.println(uniquePath_1.uniquePaths(m, n));
    }
}