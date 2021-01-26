package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelCourceTest {

    ParallelCource parallelCource = new ParallelCource();


    @Test
    void test_Data() {
        int n = 4;
        int k = 2;
        int[][] dependency = {
                {2, 1}, {3, 1}, {1, 4}
        };

        System.out.println(parallelCource.minNumberOfSemesters(n, dependency, k));
    }

    @Test
    void test_Data_2() {
        int n = 5;
        int k = 2;
        int[][] dependency = { {2,1},{3,1},{4,1},{1,5}};


        System.out.println(parallelCource.minNumberOfSemesters(n, dependency, k));
    }

    @Test
    void test_Data_22() {
        int n = 12;
        int k = 2;
        int[][] dependency =

                {{1,2},{1,3},{7,5},{7,6},{4,8},{8,9},{9,10},{10,11},{11,12}};



//        System.out.println(parallelCource.minNumberOfSemesters(n, dependency, k));
        System.out.println(parallelCource.minNumberOfSemesters_correct(n, dependency, k));
    }

    @Test
    void test_Data_222() {
        int n = 4;
        int k = 2;
        int[][] dependency =

                {{1,2},{3, 4}};

        System.out.println(parallelCource.minNumberOfSemesters(n, dependency, k));
    }

    @Test
    void test_Data_4() {
        int n = 11;
        int k = 2;
        int[][] dependency = {};


        System.out.println(parallelCource.minNumberOfSemesters(n, dependency, k));
    }
}