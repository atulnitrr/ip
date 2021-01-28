package com.example.ip2021.questions.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearializeAndDeserializeBinaryTreeTest {

    SearializeAndDeserializeBinaryTree searializeAndDeserializeBinaryTree = new SearializeAndDeserializeBinaryTree();

    @BeforeEach
    void setUp() {
    }

    @Test
    void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(searializeAndDeserializeBinaryTree.serialize(root));
    }

    @Test
    void test_3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        TreeUtil.preOrder(root);
        System.out.println();
        String serialize = searializeAndDeserializeBinaryTree.serialize(root);
        System.out.println(serialize);
        searializeAndDeserializeBinaryTree.deserialize(serialize);
    }

    @Test
    void test_5() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeUtil.preOrder(root);
        System.out.println();
        String serialize = searializeAndDeserializeBinaryTree.serialize(root);
        System.out.println(serialize);
        searializeAndDeserializeBinaryTree.deserialize(serialize);
    }

    @Test
    void test_6() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        TreeUtil.preOrder(root);
        System.out.println();
        String serialize = searializeAndDeserializeBinaryTree.serialize(root);
        System.out.println(serialize);
        searializeAndDeserializeBinaryTree.deserialize(serialize);
    }
}