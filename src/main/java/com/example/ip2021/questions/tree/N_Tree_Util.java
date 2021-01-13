package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.List;


/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/submissions/
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 *
 *
 *
 * Follow up:
 *
 * Recursive solution is trivial, could you do it iteratively?
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [5,6,3,2,4,1]
 * Example 2:
 *
 *
 *
 * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
 */
public class N_Tree_Util {

    public List<Integer> postorder(N_TreeNode root) {
        List<Integer> list  = new ArrayList<>();
        postUtil(root, list);
        return list;
    }

    public void  postUtil(N_TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        List<N_TreeNode> children = root.children;

        for (N_TreeNode treeNode : children) {
            postUtil(treeNode, list);
        }

        list.add(root.val);
    }

}
