package com.example.ip2021.questions.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilTest {

    @Test
    void name() {
        int array[] = {4, 5, 6, 3};
        ListNode listNode = ListUtil.buildList(array);
        ListUtil.printList(listNode);
    }
}