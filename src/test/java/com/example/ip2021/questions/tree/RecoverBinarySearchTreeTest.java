package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecoverBinarySearchTreeTest {

    RecoverBinarySearchTree recoverBinarySearchTree = new RecoverBinarySearchTree();

    @Test
    void test_1() {

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(7);
        treeNode.right = new TreeNode(3);
        TreeUtil.inOrder(treeNode);
        recoverBinarySearchTree.recoverTree(treeNode);
        System.out.println("--");
        TreeUtil.inOrder(treeNode);
    }

    @Test
    void test_3() {

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(10);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(9);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(3);
        TreeUtil.inOrder(treeNode);
        recoverBinarySearchTree.recoverTree(treeNode);
        System.out.println(" ");
        TreeUtil.inOrder(treeNode);
    }
}