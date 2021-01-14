package com.example.ip2021.questions.tree;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 */
public class KthSmallestInBST {


    class  SolutionData {
        int count;
        int number;

        public SolutionData() {
            count = 0 ;
            number = Integer.MIN_VALUE;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        final SolutionData solutionData = new SolutionData();
        finKth(root, solutionData, k);
        return solutionData.number;
    }

    private void finKth(TreeNode root, SolutionData solutionData, int k) {
        if (root == null) {
            return;
        }

        finKth(root.left, solutionData, k);
        solutionData.count += 1;
        if (solutionData.count == k) {
            solutionData.number = root.val;
        }

        finKth(root.right, solutionData, k);
    }
}
