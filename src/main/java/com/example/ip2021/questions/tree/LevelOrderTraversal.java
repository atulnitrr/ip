package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return  result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while ( !queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> curentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    curentLevel.add(treeNode.val);
                }

                if (treeNode != null && treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode != null && treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(curentLevel);
        }

        return result;

    }
}
