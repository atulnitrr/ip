package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class All_Root_to_leaf_PathTest {
    All_Root_to_leaf_Path leafPath = new All_Root_to_leaf_Path();


    @Test
    void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(45);
        root.left.left = new TreeNode(34);
        root.left.right = new TreeNode(33);

        leafPath.printPath(root);
    }
}