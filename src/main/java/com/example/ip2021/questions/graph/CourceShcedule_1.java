package com.example.ip2021.questions.graph;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class CourceShcedule_1 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            return true;
        }

        final Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int[] prerequisite = prerequisites[i];
            int source = prerequisite[0];
            int dest = prerequisite[1];
            List<Integer> neighbors = graph.getOrDefault(source, new ArrayList<>());
            neighbors.add(dest);
            graph.put(source, neighbors);
            indegree[dest]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {
            Integer node = queue.poll();

            if (node == null) {
                continue;
            }
            System.out.print(node + " ");
            count++;
            List<Integer> integers = graph.getOrDefault(node, new ArrayList<>());
            for (Integer neighbor : integers) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
        System.out.println("------");
        return count == numCourses;

    }
}