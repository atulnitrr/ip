package com.example.ip2021.questions.linklist;

import java.util.List;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReversLinkList {

    public ListNode reverseListRecur(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode rvhead = reverseListRecur(head.next);
        head.next.next = head;
        head.next = null;
        return  rvhead;
    }

    public ListNode reverseListIter(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head, next = null, prev = null;
        while (current != null) {
            next = current.next;
            current.next  = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
