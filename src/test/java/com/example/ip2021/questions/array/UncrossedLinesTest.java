package com.example.ip2021.questions.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UncrossedLinesTest {

    UncrossedLines uncrossedLines = new UncrossedLines();
    @BeforeEach
    void setUp() {
    }

    @Test
    void maxUncrossedLines() {
        int A[] = {2,5,1,2,5};
        int B[] = {10,5,2,1,5,2};
        System.out.println(uncrossedLines.maxUncrossedLines(A, B));
    }

    @Test
    void maxUncrossedLines2() {
        int A[] = {1,3,7,1,7,5};
        int B[] = {1,9,2,5,1};
        System.out.println(uncrossedLines.maxUncrossedLines(A, B));
    }

}