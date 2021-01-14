package com.example.ip2021.questions.linklist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PalinLinkListTest {

    PalinLinkList palinLinkList = new PalinLinkList();

    @Test
    void testData() {
        int array[] = {1, 2};
        ListNode head = ListUtil.buildList(array);
        System.out.println(palinLinkList.isPalindrome(head));

    }
}