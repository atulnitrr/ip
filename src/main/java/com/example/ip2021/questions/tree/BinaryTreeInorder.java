package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * Example 2:
 *
 * Input: root = []
 * Output: []
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 * Example 4:
 *
 *
 * Input: root = [1,2]
 * Output: [2,1]
 * Example 5:
 *
 *
 * Input: root = [1,null,2]
 * Output: [1,2]
 */
public class BinaryTreeInorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        inorderUtil(root, list);
        return list;
    }

    private void inorderUtil(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderUtil(root.left, list);
        list.add(root.val);
        inorderUtil(root.right, list);
    }
}
