package com.example.ip2021.questions.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    JumpGame jumpGame = new JumpGame();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canJump() {
        int num[] = {2,3,1,1,4};
        System.out.println(jumpGame.canJump(num));
    }

    @Test
    void canJump2() {
        int num[] = {3,2,1,0,4};
        System.out.println(jumpGame.canJump(num));
    }


}