package com.example.ip2021.questions.array;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://leetcode.com/problems/maximum-width-ramp/
 * Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].  The width of such a ramp is j - i.
 * <p>
 * Find the maximum width of a ramp in A.  If one doesn't exist, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [6,0,8,2,1,5]
 * Output: 4
 * Explanation:
 * The maximum width ramp is achieved at (i, j) = (1, 5): A[1] = 0 and A[5] = 5.
 * Example 2:
 * <p>
 * Input: [9,8,1,0,1,9,4,0,4,1]
 * Output: 7
 * Explanation:
 * The maximum width ramp is achieved at (i, j) = (2, 9): A[2] = 1 and A[9] = 1.
 * <p>
 * <p>
 * Note:
 * <p>
 * 2 <= A.length <= 50000
 * 0 <= A[i] <= 50000
 */
public class MaxWidth {

    //9,8,1,0,1,9,4,0,4,1
    public int maxWidthRampNotOptimal(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] <= A[j] && res < (j - i)) {
                    res = j - i;
                    System.out.println("i " + i + " : " + A[i] + "|| j " + j + " : " + A[j]);
                    System.out.println(res);
                }
            }
        }

        return res;
    }

    public int maxWidthRampOptimal(int[] A) {
        int res = 0;
        System.out.println(Arrays.toString(A));
        final Stack<Integer> stack = new Stack<>();
        final Stack<Integer> stackPrint = new Stack<>();
        for (int i = A.length - 1; i >= 0; i--) {
            if (stack.isEmpty() || A[i] > A[stack.peek()]) {
                stack.push(i);
//                stackPrint.push(i);
            }
        }

        for (int i = 0; i < A.length && !stack.isEmpty() ; i++) {
            if (A[i] <= A[stack.peek()]) {
                Integer pop = stack.pop();
                res = Math.max(res, pop - i);
                i--;
            }

        }

//        System.out.println(stackPrint);
//        while (!stackPrint.isEmpty()) {
//            Integer pop = stackPrint.pop();
//            System.out.println("i : " +pop + " " + A[pop]);
//        }
        return res;
    }

}
