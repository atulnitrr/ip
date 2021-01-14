package com.example.ip2021.questions.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/even-odd-tree/
 * A binary tree is named Even-Odd if it meets the following conditions:
 *
 * The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
 * For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
 * For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
 * Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false
 */
public class OddEvenTree {

    public boolean isEvenOddTree(TreeNode root) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);
        if (root.val %2 == 0) {
            return false;
        }
        while ( !queue.isEmpty()) {
            int levelSize = queue.size();
            int prevMax = Integer.MAX_VALUE;
            int prevMin = Integer.MIN_VALUE;

            for (int i = 0; i < levelSize ; i++) {
                TreeNode poll = queue.poll();
                if (level %2 == 0) {

                    if (poll.val %2 == 0 || poll.val <= prevMin) {
                        return false;
                    } else  {
                        prevMin = poll.val;
                    }
                } else {

                    if (poll.val%2 != 0 || poll.val >= prevMax) {
                        return false;
                    } else  {
                        prevMax = poll.val;
                    }

                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }

                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }

            level = level + 1;
        }

        return true;


    }
}
