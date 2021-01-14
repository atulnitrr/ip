package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/find-bottom-left-tree-value/
 * Given the root of a binary tree, return the leftmost value in the last row of the tree.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [2,1,3]
 * Output: 1
 * Example 2:
 *
 *
 * Input: root = [1,2,3,4,null,5,6,null,null,7]
 * Output: 7
 */
public class BottomLeftData {

    class SolutionData {
        int value;
        int maxLeve;

        public SolutionData() {
            value = Integer.MIN_VALUE;
            maxLeve = -1;
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        final SolutionData solutionData = new SolutionData();
        finUtil(root, 0, solutionData);
        return solutionData.value;
    }

    private void finUtil(TreeNode root, int level, SolutionData solutionData) {
        if (root == null) {
            return;
        }

        if (level > solutionData.maxLeve) {
            solutionData.maxLeve = level;
            solutionData.value = root.val;
        }
        finUtil(root.left, level +1, solutionData);
        finUtil(root.right, level +1, solutionData);
    }

}
