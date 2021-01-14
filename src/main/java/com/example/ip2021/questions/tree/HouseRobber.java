package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/house-robber-iii/
 */
public class HouseRobber {


    public int rob(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        Map<TreeNode, Integer> map = new HashMap<>();

        return robUtil(root, map);
    }

    private int robUtil(TreeNode root, Map<TreeNode, Integer> map) {
        if (map.containsKey(root)) {
            return map.get(root);
        }

        if (root == null) {
            return 0;
        }

        int childData = robUtil(root.left, map) + robUtil(root.right, map);
        int grandChildData = root.val;
        grandChildData += root.left!= null ? robUtil(root.left.left, map) + robUtil(root.left.right, map
        ) : 0;
        grandChildData += root.right != null ?  robUtil(root.right.left, map) + robUtil(root.right.right, map) : 0;

        map.put(root, Math.max(childData, grandChildData));
        return map.get(root);
    }

}
