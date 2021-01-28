package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class All_Root_to_leaf_Path {

    public void printPath(final TreeNode root) {
        if (root == null) {
            return;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        printUtil(root, current, result);

        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }

    private void printUtil(TreeNode root, List<Integer> current, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            current.add(root.val);
            result.add(new ArrayList<>(current));
            current.remove(current.size() - 1);
            return;
        }

        current.add(root.val );
        printUtil(root.left, current, result);
        printUtil(root.right, current, result);
        current.remove(current.size() -1);
    }
}