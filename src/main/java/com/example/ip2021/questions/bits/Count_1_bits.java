package com.example.ip2021.questions.bits;

public class Count_1_bits {

    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask = mask << 1;
        }
        return bits;
    }
}