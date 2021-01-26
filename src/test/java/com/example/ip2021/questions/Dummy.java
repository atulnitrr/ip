package com.example.ip2021.questions;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class Dummy {

    @Test
    void test_priority_queue() {

        int[] numbes = {9, 7, 2, 3, 4, 5, 6};

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> numbes[b] - numbes[a]);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>( (value1, value2) ->   numbes[value2] - numbes[value1]);

        for (int i = 0; i < numbes.length; i++) {
            priorityQueue.add(i);
        }

        System.out.println(priorityQueue);
        while ( !priorityQueue.isEmpty() ) {
            Integer poll = priorityQueue.poll();
            System.out.print( numbes[poll] + " ");
//            System.out.println(poll);
//            System.out.println(priorityQueue);
        }

    }
}