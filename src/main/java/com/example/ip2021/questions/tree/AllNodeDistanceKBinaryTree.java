package com.example.ip2021.questions.tree;

import java.util.*;

/**
 * https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
 * We are given a binary tree (with root node root), a target node, and an integer value K.
 *
 * Return a list of the values of all nodes that have a distance K from the target node.  The answer can be returned in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
 *
 * Output: [7,4,1]
 *
 * Explanation:
 * The nodes that are a distance 2 from the target node (with value 5)
 * have values 7, 4, and 1.
 *
 *
 *
 * Note that the inputs "root" and "target" are actually TreeNodes.
 * The descriptions of the inputs above are just serializations of these objects.
 *
 *
 * Note:
 *
 * The given tree is non-empty.
 * Each node in the tree has unique values 0 <= node.val <= 500.
 * The target node is a node in the tree.
 * 0 <= K <= 1000.
 *
 * logic
 * 1. make parent mapping
 * 2. do DFS for left , right and parent, keep track of visited
 */
public class AllNodeDistanceKBinaryTree {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        final List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        final Map<TreeNode, TreeNode> parentMap  = new HashMap<>();

        buildParentMap(root, null, parentMap);
        Set<TreeNode> visited = new HashSet<>();
        dfs(target, K, parentMap, visited, list);
        return list;
    }

    private void dfs(TreeNode target, int level, Map<TreeNode, TreeNode> parentMap, Set<TreeNode> visited, final List<Integer> list ) {

        if (target == null || visited.contains(target)) {
            return;
        }

        if (level == 0) {
            list.add(target.val);
        } else {
            visited.add(target);
            dfs(target.left, level -1, parentMap, visited, list);
            dfs(target.right, level -1, parentMap, visited, list);
            dfs(parentMap.get(target), level -1, parentMap, visited, list);
        }
    }

    private void buildParentMap(TreeNode cureent, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (cureent == null) {
            return;
        }
        parentMap.put(cureent, parent);
        buildParentMap(cureent.left, cureent, parentMap);
        buildParentMap(cureent.right, cureent, parentMap);
    }

}
