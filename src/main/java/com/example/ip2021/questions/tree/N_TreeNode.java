package com.example.ip2021.questions.tree;

import java.util.List;

public class N_TreeNode {

    int val;
    List<N_TreeNode> children;


    public N_TreeNode() {
    }

    public N_TreeNode(int val) {
        this.val = val;
    }

    public N_TreeNode(int val, List<N_TreeNode> children) {
        this.val = val;
        this.children = children;
    }
}
