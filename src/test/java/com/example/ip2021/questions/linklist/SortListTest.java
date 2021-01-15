package com.example.ip2021.questions.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    SortList sortList = new SortList();

    @Test
    void testData() {
        int[] data = {1, 5, 9, 12, 14, 3};
        ListNode listNode = ListUtil.buildList(data);
        sortList.sortList(listNode);
    }


    @Test
    void testDataV3() {
        int[] data = {1, 5, 99, 13, 34,  12, 14, };
        ListNode listNode = ListUtil.buildList(data);
        System.out.println(sortList.getMiddle(listNode).val);;
    }
}