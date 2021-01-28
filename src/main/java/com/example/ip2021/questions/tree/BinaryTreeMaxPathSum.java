package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 *
 * The path sum of a path is the sum of the node's values in the path.
 *
 * Given the root of a binary tree, return the maximum path sum of any path.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3]
 * Output: 6
 * Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * Example 2:
 *
 *
 * Input: root = [-10,9,20,null,null,15,7]
 * Output: 42
 * Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 */
public class BinaryTreeMaxPathSum {

    class SolutionV {
        int maxValue;

        public SolutionV() {
            maxValue = Integer.MIN_VALUE;
        }
    }
    public int maxPathSum(TreeNode root) {
        SolutionV solution = new SolutionV();
        maxPathUtil(root, solution);
        return solution.maxValue;
    }

    private int maxPathUtil(TreeNode root, SolutionV solution) {
        if (root ==  null) {
            return 0;
        }

        int leftValue = maxPathUtil(root.left, solution);
        int rightValue = maxPathUtil(root.right, solution);
        int straightPath = Math.max(root.val, Math.max(leftValue, rightValue) + root.val);
        int rootPath = Math.max(root.val, rightValue + leftValue + root.val);
        solution.maxValue = Math.max(solution.maxValue, Math.max(rootPath, straightPath));
        return straightPath;

    }
}