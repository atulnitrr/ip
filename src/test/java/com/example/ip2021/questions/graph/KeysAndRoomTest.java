package com.example.ip2021.questions.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeysAndRoomTest {

    KeysAndRoom keysAndRoom = new KeysAndRoom();

    @BeforeEach
    void setUp() {
    }

    @Test
    void canVisitAllRooms() {
        List<List<Integer>> data = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(2);
        List<Integer> list3 = Arrays.asList(3);

        data.add(list1);
        data.add(list2);
        data.add(list3);
        data.add(new ArrayList<>());
        boolean b = keysAndRoom.canVisitAllRooms(data);
        System.out.println(b);

    }

    @Test
    void canVisitAllRooms_dfs_1() {
        List<List<Integer>> data = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(2);
        List<Integer> list3 = Arrays.asList(3);

        data.add(list1);
        data.add(list2);
        data.add(list3);
        data.add(new ArrayList<>());
        boolean b = keysAndRoom.canVisitAllRooms(data);
        System.out.println(b);

    }

    @Test
    void canVisitAllRooms_Data() {
        List<List<Integer>> data = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 3);
        List<Integer> list2 = Arrays.asList(3, 0 , 1);
        List<Integer> list3 = Arrays.asList(2);
        List<Integer> list4 = Arrays.asList(0);

        data.add(list1);
        data.add(list2);
        data.add(list3);
        data.add(list4);
        boolean b = keysAndRoom.canVisitAllRooms(data);
        System.out.println(b);

    }

    @Test
    void canVisitAllRooms_dfs() {
        List<List<Integer>> data = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 3);
        List<Integer> list2 = Arrays.asList(3, 0 , 1);
        List<Integer> list3 = Arrays.asList(2);
        List<Integer> list4 = Arrays.asList(0);

        data.add(list1);
        data.add(list2);
        data.add(list3);
        data.add(list4);
        boolean b = keysAndRoom.canVisitAllRoomsDfs(data);
        System.out.println(b);

    }
}