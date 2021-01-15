package com.example.ip2021.questions.linklist;

import java.util.HashMap;
import java.util.Map;

public class RandomCopy {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            next = null;
            random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        final Map<Node, Node> map = new HashMap<>();
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        for (Node node : map.keySet()) {
            Node newNode = map.get(node);
            newNode.next = map.get(node.next);
            newNode.random = map.get(node.random);
        }

        return map.get(head);
    }
}
