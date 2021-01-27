package com.example.ip2021.questions.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringChainTest {

    LongestStringChain longestStringChain;
    @BeforeEach
    void setUp() {

        longestStringChain = new LongestStringChain();
    }

    @Test
    void test__2() {
        String[] words = {  "a","b","ba","bca","bda","bdca"};
        System.out.println(longestStringChain.longestStrChain(words));
     }

     @Test
    void test__3() {
        String[] words = {  "xbc","pcxbcf","xb","cxbc","pcxbc"};
        System.out.println(longestStringChain.longestStrChain(words));
     }

     @Test
    void test__4() {
        String[] words = {  "a","b","ab","bac"};
        System.out.println(longestStringChain.longestStrChain(words));
     }
}