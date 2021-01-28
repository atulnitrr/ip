package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where each path's sum equals targetSum.
 * <p>
 * A leaf is a node with no children.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: [[5,4,11,2],[5,8,4,5]]
 * Example 2:
 * <p>
 * <p>
 * Input: root = [1,2,3], targetSum = 5
 * Output: []
 * Example 3:
 * <p>
 * Input: root = [1,2], targetSum = 0
 * Output: []
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * Accepted
 * 387,468
 * Submissions
 * 794,310
 */
public class All_PathSum_TO_K {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> currentPath = new ArrayList<>(50000);
        pathUtil(root, targetSum, currentPath);
        return result;
    }

    private void pathUtil(TreeNode root, int targetSum, List<Integer> currentPath) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && targetSum == root.val) {
            currentPath.add(root.val);
            result.add(new ArrayList<>(currentPath));
            currentPath.remove(currentPath.size() -1);
            return;
        }
        currentPath.add(root.val);
        pathUtil(root.left, targetSum - root.val , currentPath);
        pathUtil(root.right, targetSum - root.val, currentPath);
        currentPath.remove(currentPath.size() -1);
    }
}