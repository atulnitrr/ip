package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement majorityElement = new MajorityElement();
    @BeforeEach
    void setUp() {
    }

    @Test
    void majorityElement() {

        int[] nums = {3, 3, 2};
        System.out.println(majorityElement.majorityElement(nums));
    }
}