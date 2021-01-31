package com.example.ip2021.questions.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/reorganize-string/
 * Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.
 * <p>
 * If possible, output any possible result.  If not possible, return the empty string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "aab"
 * Output: "aba"
 * Example 2:
 * <p>
 * Input: S = "aaab"
 * Output: ""
 */
public class ReorganizeString {

    public String reorganizeString(String S) {
        StringBuilder result = new StringBuilder();
        char[] chars = S.toCharArray();
        Map<Character, Integer> count = new HashMap<>();
        for (Character ch : chars) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        int maxValue = count.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        if (maxValue > Math.ceil( (double) S.length() / 2.0 )) {
            return "";
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));

        for (Character character : count.keySet()) {
            priorityQueue.add(character);
        }


        while (priorityQueue.size() > 1 ) {
            Character a = priorityQueue.poll();
            Character b = priorityQueue.poll();
            result.append(a);
            result.append(b);
            if ( count.get(a) > 1) {
                count.put(a, count.get(a) -1);
                priorityQueue.add(a);
            }

            if (count.get(b) > 1) {
                count.put(b, count.get(b) -1);
                priorityQueue.add(b);
            }

        }
        while (!priorityQueue.isEmpty() ) {
            result.append(priorityQueue.poll());
        }


        return result.toString();
    }
}