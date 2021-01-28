package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class All_PathSum_TO_KTest {

    All_PathSum_TO_K pathSumToK = new All_PathSum_TO_K();

    @Test
    void test_11() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        int target = 10;
        List<List<Integer>> lists = pathSumToK.pathSum(root, target);

        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }
}