package com.example.ip2021.questions.bits;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/counting-bits/
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: [0,1,1]
 * Example 2:
 * <p>
 * Input: 5
 * Output: [0,1,1,2,1,2]
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 */
public class Count_All_Bits {

    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int i1 = i >> 1;
            int i2 = i & 1;

            ans[i] = ans[i1] + i2;

            System.out.println("i -> " +  i + ", i1 ->" +  i1 +  ", ans[i1] -> " +ans[i1] +  ", i2-> " + i2 + ", ans[i] -> " + ans[i]);
            System.out.println(Arrays.toString(ans));
        }
        return ans;
    }

    public int[] countBits__(int num) {
        int[] ans = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ans[i] = count_Bits(i);
        }
        return ans;
    }

    int count_Bits(int n) {
        int mask = 1;
        int bits = 0;

        for (int i = 0; i < 31; i++) {
            if ((n & mask) != 0) {
                bits++;

            }
            mask = mask << 1;
        }
        return bits;
    }
}