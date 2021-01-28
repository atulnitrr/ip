package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesTest {

    CountGoodNodes countGoodNodes = new CountGoodNodes();

    @BeforeEach
    void setUp() {
    }

    @Test
    void test_1() {
        TreeNode root = new TreeNode(4);
        System.out.println(countGoodNodes.goodNodes(root));
    }
}