package com.example.ip2021.questions.tree;

public class TreeUtil {

    public static void preOrder(final TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.val + " ");
        preOrder(treeNode.left);
        preOrder(treeNode.right);
    }

    public static void inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        inOrder(treeNode.left);
        System.out.print(treeNode.val + " ");
        inOrder(treeNode.right);
    }
}