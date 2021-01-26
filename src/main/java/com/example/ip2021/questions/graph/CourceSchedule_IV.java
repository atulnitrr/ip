package com.example.ip2021.questions.graph;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule-iv/
 * There are a total of n courses you have to take, labeled from 0 to n-1.
 *
 * Some courses may have direct prerequisites, for example, to take course 0 you have first to take course 1, which is expressed as a pair: [1,0]
 *
 * Given the total number of courses n, a list of direct prerequisite pairs and a list of queries pairs.
 *
 * You should answer for each queries[i] whether the course queries[i][0] is a prerequisite of the course queries[i][1] or not.
 *
 * Return a list of boolean, the answers to the given queries.
 *
 * Please note that if course a is a prerequisite of course b and course b is a prerequisite of course c, then, course a is a prerequisite of course c.
 *
 *
 *
 * Example 1:
 */
public class CourceSchedule_IV {

    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] allPreReq = new boolean[n][n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        int[] inDegree = new int[n];
        for(int [] ele : prerequisites){
            adj.get(ele[0]).add(ele[1]);
            inDegree[ele[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
            if(inDegree[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int x = q.poll();
            for(int neig : adj.get(x)){
                for(int i=0;i<n;i++)
                    if(allPreReq[x][i] || i==x)allPreReq[neig][i] = true;
                if(--inDegree[neig]==0)q.add(neig);
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int[] ele : queries){
            int prereq = ele[0];
            int course = ele[1];
            if(allPreReq[course][prereq])ans.add(true);
            else ans.add(false);
        }
        return ans;
    }

    public List<Boolean> checkIfPrerequisite_(int n, int[][] prerequisites, int[][] queries) {
        List<Boolean> result = new ArrayList<>();
        int[] intDegree = new int[n];
        Map<Integer, List<Integer>> graph = graph(prerequisites, intDegree);
        Queue<Integer> queue = new LinkedList<>();
        boolean[][] data = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            if (intDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty() ) {
            Integer x = queue.poll();
            System.out.println(queue);
            for (Integer neighbor : graph.getOrDefault(x, new ArrayList<>())) {

                for (int i = 0; i < n; i++) {
                    if (data[x][i] || i == x) {
                        data[neighbor][i] = true;
                    }
                }
                intDegree[neighbor]--;
                if (intDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
//            System.out.println(Arrays.toString(query));
            if (data[query[1]][query[0]]) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    private Map<Integer, List<Integer>> graph(int[][] prerequisites, int[] intDegree) {
        final Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            int[] prerequisite = prerequisites[i];
            int src = prerequisite[0];
            int des = prerequisite[1];
            List<Integer> neighbors = graph.getOrDefault(src, new ArrayList<>());
            neighbors.add(des);
            graph.put(src, neighbors);
            intDegree[des]++;
        }
        return graph;
    }
}