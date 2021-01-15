package com.example.ip2021.questions.linklist;

public class SortList {

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode middleNode = getMiddle(head);
        if (middleNode != null) {
            System.out.println(middleNode.val);
        }
        ListNode middleNext = middleNode.next;
        middleNode.next = null;
        ListNode leftSort = sortList(head);
        ListNode rightSort = sortList(middleNext);

        return mergeList(leftSort, rightSort);

    }

    private ListNode mergeList(ListNode leftSort, ListNode rightSort) {
        if (leftSort == null) {
            return rightSort;
        }

        if (rightSort == null) {
            return leftSort;
        }

        if (leftSort.val <= rightSort.val) {
            leftSort.next = mergeList(leftSort.next, rightSort);
            return leftSort;
        } else {
            rightSort.next = mergeList(leftSort, rightSort.next);
            return rightSort;
        }


    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
