package com.example.ip2021.questions.graph;


import java.util.*;

public class TopoSort {


    public void topoSort(final int vertices, int[][] edges)  {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] inDegree = new int[vertices];

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int src = edge[0];
            int dest = edge[1];
            List<Integer> neighbors = graph.getOrDefault(src, new ArrayList<>());
            neighbors.add(dest);
            graph.put(src, neighbors);
            inDegree[dest]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (  !queue.isEmpty() ) {
            Integer node = queue.poll();
            if (node == null) {
                continue;
            }

            System.out.print( node + " ");
            for (Integer neighbor :  graph.getOrDefault(node, new ArrayList<>())) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();

    }
}