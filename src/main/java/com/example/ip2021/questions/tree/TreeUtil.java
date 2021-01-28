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
}