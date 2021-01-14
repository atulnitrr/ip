package com.example.ip2021.questions.linklist;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 */
public class PalinLinkList {

    class SolutionData {
        ListNode left;
        boolean isPalin;

        public SolutionData() {
            left = null;
            isPalin = true;
        }
    }

    public boolean isPalindrome(ListNode head) {
        // 1 2 3
        if (head == null || head.next == null) {
            return true;
        }

        SolutionData solutionData = new SolutionData();
        solutionData.left = head;
        palinUtil(head, solutionData);
        return solutionData.isPalin;
    }

    private void palinUtil(ListNode head, SolutionData solutionData) {
        if (head == null) {
            return;
        }
        palinUtil(head.next, solutionData);
        solutionData.isPalin = solutionData.isPalin && solutionData.left.val == head.val;
        solutionData.left = solutionData.left.next;
    }
}
