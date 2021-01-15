package com.example.ip2021.questions.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {
    
    SortList sortList = new SortList();

    @Test
    void testData() {
        int[] data =  {1, 5, 9, 12, 14, 3};
        ListNode listNode = ListUtil.buildList(data);
        sortList.sortList(listNode);
    }
}