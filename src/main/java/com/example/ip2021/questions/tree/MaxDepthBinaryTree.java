package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 *
 * Input: root = [1,null,2]
 * Output: 2
 * Example 3:
 *
 * Input: root = []
 * Output: 0
 */
public class MaxDepthBinaryTree {
    class SolutionData {
        int maxValue;

        public SolutionData() {
            maxValue = 0;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        SolutionData solutionData = new SolutionData();
        maxUtil(root, solutionData, 1);
        return solutionData.maxValue;
    }

    private void maxUtil(TreeNode root, SolutionData solutionData, int  level) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && solutionData.maxValue < level) {
            solutionData.maxValue = level;
        }

        maxUtil(root.left, solutionData, level + 1);
        maxUtil(root.right, solutionData, level + 1);
    }
}
