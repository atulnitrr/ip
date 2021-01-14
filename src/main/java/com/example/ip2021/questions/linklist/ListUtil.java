package com.example.ip2021.questions.linklist;

public class ListUtil {

    public static ListNode buildList(int[] array) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int i = 0; i < array.length; i++) {
            tail.next = new ListNode(array[i]);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println(" ");
    }
}
