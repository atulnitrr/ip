package com.example.ip2021.questions.tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder_N_Array {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preutil(root, list);
        return list;
    }

    private void preutil(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        for (Node node : root.children) {
            preutil(node, list);
        }
    }

}

class Node {
    int val;
    List<Node> children;

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }
}
