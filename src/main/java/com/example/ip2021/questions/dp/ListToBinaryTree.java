package com.example.ip2021.questions.dp;

import com.example.ip2021.questions.linklist.ListNode;
import com.example.ip2021.questions.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. https://leetcode.com/problems/linked-list-in-binary-tree/
 * Given a binary tree root and a linked list with head as the first node.
 * <p>
 * Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.
 * <p>
 * In this context downward path means a path that starts at some node and goes downwards.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 * Explanation: Nodes in blue form a subpath in the binary Tree.
 */
public class ListToBinaryTree {

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null && root == null) {
            return true;
        }

        List<TreeNode> allTree = new ArrayList<>();
        getTree(root, head.val, allTree);

        for (int i = 0; i < allTree.size(); i++) {
            TreeNode treeNode = allTree.get(i);
            if (isPathPresent(treeNode, head)) {
                return true;
            }
        }

        return false;
    }

    private boolean isPathPresent(TreeNode treeNode, ListNode head) {
        if (head == null && treeNode == null) {
            return true;
        }

        if (head == null ^ treeNode == null) {
            return false;
        }

        if (head.next == null && head.val == treeNode.val) {
            return true;
        }

        return treeNode.val == head.val && (isPathPresent(treeNode.left, head.next) || isPathPresent(treeNode.right, head.next));
    }

    private void getTree(TreeNode root, int val, List<TreeNode> allTree) {
        if (root == null) {
            return;
        }

        if (root.val == val) {
            allTree.add(root);
        }
        getTree(root.left, val, allTree);
        getTree(root.right, val, allTree);
    }
}