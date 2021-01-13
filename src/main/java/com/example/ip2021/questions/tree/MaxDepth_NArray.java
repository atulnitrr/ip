package com.example.ip2021.questions.tree;

import java.util.List;

public class MaxDepth_NArray {

    class SolutionData {
        int maxValue;

        public SolutionData() {
            maxValue = 0;
        }

        public SolutionData(int maxValue) {
            this.maxValue = maxValue;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        SolutionData solution = new SolutionData();

        maxDepthUtil(root, solution, 1);

        return solution.maxValue;
    }

    private void maxDepthUtil(Node root, SolutionData solution, int currnetLevel) {

        if (root == null) {
            return;
        }

        if ( solution.maxValue < currnetLevel  ) {
            solution.maxValue = currnetLevel;
        }
        for (Node node : root.children) {
            maxDepthUtil(node, solution, currnetLevel + 1);
        }
    }

}




