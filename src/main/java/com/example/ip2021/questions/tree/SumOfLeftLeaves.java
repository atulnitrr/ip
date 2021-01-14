package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 * Find the sum of all left leaves in a given binary tree.
 *
 * Example:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves {

    class SolutionData {
        int sum;

        public SolutionData() {
            sum = 0;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }
        final SolutionData solutionData = new SolutionData();
        findSum(root, solutionData);
        return solutionData.sum;

    }

    private void findSum(TreeNode root, SolutionData solutionData) {
        if (root == null) {
            return;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            solutionData.sum += root.left.val;
        }
        findSum(root.left, solutionData);
        findSum(root.right, solutionData);
    }
}
