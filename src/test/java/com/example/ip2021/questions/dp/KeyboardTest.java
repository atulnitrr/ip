package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardTest {

    Keyboard keyboard = new Keyboard();

    @BeforeEach
    void setUp() {

    }

    @Test
    void testData() {
        System.out.println(keyboard.minSteps(3));
    }

    @Test
    void testData_5() {
        System.out.println(keyboard.minSteps(5));
    }

    @Test
    void testData_78() {
        System.out.println(keyboard.minSteps(33));
    }
}