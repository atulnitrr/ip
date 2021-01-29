package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/path-sum-iii/
 * ou are given a binary tree in which each node contains an integer value.
 * <p>
 * Find the number of paths that sum to a given value.
 * <p>
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
 * <p>
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 * <p>
 * Example:
 * <p>
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * <p>
 * 10
 * /  \
 * 5   -3
 * / \    \
 * 3   2   11
 * / \   \
 * 3  -2   1
 * <p>
 * Return 3. The paths that sum to 8 are:
 * <p>
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 */
public class PathSUm_3 {

    class Data {
        int ans;

    }

    public int pathSum(TreeNode root, int sum) {
        Data data = new Data();
        count(root, data, sum);
        return data.ans;
    }

    public void count(TreeNode treeNode, Data data, int sum) {
        if (treeNode == null) {
            return;
        }

        if (canFind(treeNode, sum)) {
            data.ans++;
        }
        count(treeNode.left, data, sum);
        count(treeNode.right, data, sum);
    }

    public boolean canFind(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.val == sum) {
            return true;
        }

        return canFind(root.left, sum - root.val) || canFind(root.right, sum - root.val);
    }
}