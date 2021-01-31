package com.example.ip2021.questions.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeStringTest {

    ReorganizeString reorganizeString = new ReorganizeString();

    @BeforeEach
    void setUp() {
    }


    @Test
    void test_33() {
        final String string = "aab";
        System.out.println(reorganizeString.reorganizeString(string));
    }


    @Test
    void test_34() {
        final String string = "aaab";
        System.out.println(reorganizeString.reorganizeString(string));
    }

    @Test
    void test_er() {
        final String string = "aab";
        Map<Character, Integer> count = new HashMap<>();

        char[] chars = string.toCharArray();
        for (Character ch : chars) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        int maxValue = count.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        if (maxValue > Math.ceil( string.length() /2)) {
        }
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> count.get(b)  - count.get(a));

        for (Character character : count.keySet()  ) {
            priorityQueue.add(character);
        }

        final StringBuilder result =  new StringBuilder();
        while ( priorityQueue.size() > 1) {
            Character a = priorityQueue.poll();
            Character b = priorityQueue.poll();
            result.append(a);
            result.append(b);

            if ( count.get(a) > 1 ) {
                count.put( a, count.get(a)-1);
                priorityQueue.add(a);
            }

            if (count.get(b) > 1) {
                count.put(b, count.get(b) -1);
                priorityQueue.add(b);
            }
        }

        while (!priorityQueue.isEmpty()) {
            result.append(priorityQueue.poll());
        }


        System.out.println(result.toString());

        System.out.println(count);
        System.out.println("data --> ");
    }
}