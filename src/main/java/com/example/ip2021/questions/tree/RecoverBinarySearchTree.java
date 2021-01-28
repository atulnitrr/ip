package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/recover-binary-search-tree/
 * You are given the root of a binary search tree (BST), where exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
 * <p>
 * Follow up: A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [1,3,null,null,2]
 * Output: [3,1,null,null,2]
 * Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
 * Example 2:
 * <p>
 * <p>
 * Input: root = [3,1,4,null,null,2]
 * Output: [2,1,4,null,null,3]
 * Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.
 */
public class RecoverBinarySearchTree {
    TreeNode prevValue = null;
    TreeNode firstNode = null;
    TreeNode secondNode = null;

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        recoverUtil(root);
        if (firstNode != null && secondNode != null) {
            int value1 = firstNode.val;;
            firstNode.val = secondNode.val;
            secondNode.val = value1;
        }

    }

    public void recoverUtil(TreeNode root) {
        if (root == null) {
            return;
        }
        recoverUtil(root.left);
        if (prevValue != null && prevValue.val > root.val) {
            if (firstNode == null) {
                firstNode = prevValue;
            }
            secondNode = root;
        }

        prevValue = root;
        recoverUtil(prevValue.right);
    }
}