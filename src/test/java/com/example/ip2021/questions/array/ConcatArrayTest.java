package com.example.ip2021.questions.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ConcatArrayTest {

    ConcatArray concatArray  = new ConcatArray();



    @Test
    void name() {

        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(concatArray.getAns(nums)));
    }

    @Test
    void name_2() {

        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(concatArray.getAns(nums)));
    }
}