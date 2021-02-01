package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 * Example 1:
 *
 *
 * Input: root = [2,1,3]
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 */
public class ValidBST {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isValidUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidUtil(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        return   root.val > minValue && root.val < maxValue &&
                isValidUtil(root.left, minValue, root.val) &&
                isValidUtil(root.right, root.val, maxValue);
    }
}