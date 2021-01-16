package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    HouseRobber houseRobber = new HouseRobber();

    @BeforeEach
    void setUp() {
    }

    @Test
    void rob() {
        int nums[] = {1,2,3,1};
        System.out.println(houseRobber.rob(nums));
    }

    @Test
    void rob3() {
        int nums[] = {2,7,9,3,1};
        System.out.println(houseRobber.rob(nums));
    }


}