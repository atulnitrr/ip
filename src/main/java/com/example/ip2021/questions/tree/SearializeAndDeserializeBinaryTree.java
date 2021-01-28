package com.example.ip2021.questions.tree;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3,null,null,4,5]
 * Output: [1,2,3,null,null,4,5]
 * Example 2:
 *
 * Input: root = []
 * Output: []
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 * Example 4:
 *
 * Input: root = [1,2]
 * Output: [1,2]
 */
public class SearializeAndDeserializeBinaryTree {

    class PreorderIndex {
        int index;

        public PreorderIndex() {

        }
    }
    public String serialize(TreeNode root) {
        final StringBuilder stringBuilder = new StringBuilder();
        serializeUtil(root, stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        return stringBuilder.toString();
    }

    private void serializeUtil(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            stringBuilder.append("null").append(",");
            return;
        }
        stringBuilder.append(root.val).append(",");
        serializeUtil(root.left, stringBuilder);
        serializeUtil(root.right, stringBuilder);
    }


    public TreeNode deserialize(String data) {
        PreorderIndex preorderIndex = new PreorderIndex();

        TreeNode root = desUtil(data.split(","), preorderIndex);
        TreeUtil.preOrder(root);
        System.out.println();
        return root;
    }

    private TreeNode desUtil(String[] split, PreorderIndex preorderIndex) {
        String value = split[preorderIndex.index++];
        if ("null".equals(value)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(value));
        root.left = desUtil(split, preorderIndex);
        root.right = desUtil(split, preorderIndex);

        return root;
    }
}