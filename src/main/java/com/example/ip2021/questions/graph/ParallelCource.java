package com.example.ip2021.questions.graph;

import java.util.*;

/**
 * https://leetcode.com/problems/parallel-courses-ii/
 * Given the integer n representing the number of courses at some university labeled from 1 to n, and the array dependencies where dependencies[i] = [xi, yi]  represents a prerequisite relationship, that is, the course xi must be taken before the course yi.  Also, you are given the integer k.
 *
 * In one semester you can take at most k courses as long as you have taken all the prerequisites for the courses you are taking.
 *
 * Return the minimum number of semesters to take all courses. It is guaranteed that you can take all courses in some way.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: n = 4, dependencies = [[2,1],[3,1],[1,4]], k = 2
 * Output: 3
 * Explanation: The figure above represents the given graph. In this case we can take courses 2 and 3 in the first semester, then take course 1 in the second semester and finally take course 4 in the third semester.
 * Example 2:
 *
 *
 *
 * Input: n = 5, dependencies = [[2,1],[3,1],[4,1],[1,5]], k = 2
 * Output: 4
 * Explanation: The figure above represents the given graph. In this case one optimal way to take all courses is: take courses 2 and 3 in the first semester and take course 4 in the second semester, then take course 1 in the third semester and finally take course 5 in the fourth semester.
 * Example 3:
 *
 * Input: n = 11, dependencies = [], k = 2
 * Output: 6
 */
public class ParallelCource {

    public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        int ans = 0;
        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n+1];
        Map<Integer, List<Integer>> graph = createGraph(dependencies, inDegree, outDegree);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
         Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }


        while (!queue.isEmpty()) {

            int queueSize = queue.size();
            ans += (Math.ceil( (double) queueSize / k ));

            for (int i = 0; i < queueSize; i++) {
                Integer node = queue.poll();
                if (node == null) {
                    continue;
                }
                System.out.print(node + " ");
                for (Integer neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                     inDegree[neighbor]--;
                     if (inDegree[neighbor] == 0) {
                         queue.add(neighbor);
                     }
                }
            }

            System.out.println();
        }
        System.out.println(Arrays.toString(inDegree));
        return ans;
    }


    public int minNumberOfSemesters_correct(int n, int[][] dependencies, int k) {
        int ans = 0;
        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n + 1];
        Map<Integer, List<Integer>> graph = createGraph(dependencies, inDegree, outDegree);

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> outDegree[b] - outDegree[a]);
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                priorityQueue.add(i);
            }
        }

//        while ( !priorityQueue.isEmpty()) {
//            System.out.println(priorityQueue.poll());
//        }
//        System.out.println("lkjlkjlkj");

        while (!priorityQueue.isEmpty()) {
            int size = priorityQueue.size();
            System.out.println(priorityQueue);
            for (int i = 0; i < Math.min(size, k); i++) {
                Integer node = priorityQueue.poll();
                System.out.println(node);
                for (Integer neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        priorityQueue.add(neighbor);
                    }
                }
            }
            System.out.println("---");
            ans ++;
        }
        return ans;
    }

    private Map<Integer, List<Integer>> createGraph(int[][] dependencies, int[] inDegree, int[] outDegree) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < dependencies.length ; i++) {
            int[] edge = dependencies[i];
            int src = edge[0];
            int des = edge[1];
            List<Integer> neighbors = graph.getOrDefault(src, new ArrayList<>());
            neighbors.add(des);
            graph.put(src, neighbors);
            inDegree[des]++;
            outDegree[src]++;
        }
        return graph;
    }
}