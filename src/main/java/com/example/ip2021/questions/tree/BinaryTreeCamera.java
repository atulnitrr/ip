package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/binary-tree-cameras/
 * Given a binary tree, we install cameras on the nodes of the tree.
 *
 * Each camera at a node can monitor its parent, itself, and its immediate children.
 *
 * Calculate the minimum number of cameras needed to monitor all nodes of the tree.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: [0,0,null,0,0]
 * Output: 1
 * Explanation: One camera is enough to monitor all nodes if placed as shown.
 * Example 2:
 *
 *
 * Input: [0,0,null,0,null,0,null,null,0]
 * Output: 2
 * Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
 */
public class BinaryTreeCamera {

    int value = 0;
    enum Status {
        NA, NEED_CAMERA, HAS_CAMERA, COVERED
    }
    public int minCameraCover(TreeNode root) {
        Status status = minUtil(root);

        return Status.NEED_CAMERA.equals(status) ? value + 1 : value;
    }

    private Status minUtil(TreeNode root) {
        if (root == null) {
            return Status.NA;
        }
        if (root.left == null && root.right == null) {
            return Status.NEED_CAMERA;
        }
        Status leftStatus = minUtil(root.left);
        Status rightStatus = minUtil(root.right);
        if (Status.NEED_CAMERA.equals(leftStatus) || Status.NEED_CAMERA.equals(rightStatus)) {
            value++;
            return Status.HAS_CAMERA;
        }

        if (Status.HAS_CAMERA.equals(leftStatus) || Status.HAS_CAMERA.equals(rightStatus)) {
            return Status.COVERED;
        }

        return Status.NEED_CAMERA;
    }
}