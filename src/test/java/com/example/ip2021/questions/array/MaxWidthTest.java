package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxWidthTest {

    MaxWidth maxWidth;

    @BeforeEach
    void setUp() {
        maxWidth = new MaxWidth();
    }

    @Test
    void name() {
        int A[] = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidth.maxWidthRampNotOptimal(A));
    }

    @Test
    void name3() {
        int A[] = {6,0,8,2,1,5};
        System.out.println(maxWidth.maxWidthRampNotOptimal(A));
    }



    @Test
    void nameOpt1() {
        int A[] = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidth.maxWidthRampOptimal(A));
    }
    @Test
    void nameOpt2() {
        int A[] = {6,0,8,2,1,5};
        System.out.println(maxWidth.maxWidthRampOptimal(A));
    }

}