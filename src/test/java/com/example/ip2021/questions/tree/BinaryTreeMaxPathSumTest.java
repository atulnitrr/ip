package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaxPathSumTest {

    BinaryTreeMaxPathSum maxPathSum = new BinaryTreeMaxPathSum();

    @BeforeEach
    void setUp() {
    }

    @Test
    void maxPathSum() {

        TreeNode treeNode = new TreeNode(-6);
//        treeNode.left = new TreeNode(-9);
//        treeNode.right = new TreeNode(-2);
        System.out.println(maxPathSum.maxPathSum(treeNode));
    }
}