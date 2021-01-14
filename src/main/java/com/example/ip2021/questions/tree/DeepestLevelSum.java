package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/deepest-leaves-sum/
 * Given a binary tree, return the sum of values of its deepest leaves.
 *
 *
 * Example 1:
 *
 *
 *
 * Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * Output: 15
 */
public class DeepestLevelSum {

    class  SolutionData {
        int maxLevel;
        int sum;

        public SolutionData() {
            maxLevel = -1;
            sum = 0;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }

        final SolutionData solutionData = new SolutionData();
        findSolution(root, 0, solutionData);
        return solutionData.sum;
    }

    private void findSolution(TreeNode root, int level, SolutionData solutionData) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (level > solutionData.maxLevel) {
                solutionData.maxLevel = level;
                solutionData.sum = 0;
                solutionData.sum += root.val;
            } else if (level == solutionData.maxLevel) {
                solutionData.sum += root.val;
            }
        }

        findSolution(root.left, level + 1, solutionData);
        findSolution(root.right, level + 1, solutionData);
    }


}
