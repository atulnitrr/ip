package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSUm_3Test {

    PathSUm_3 pathSUm_3 = new PathSUm_3();

    @Test
    void test_1() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(1);

        root.right = new TreeNode(-3);
        root.right.right = new TreeNode(11);

        int sum = 8;
        System.out.println(pathSUm_3.pathSum(root, sum));
    }
}