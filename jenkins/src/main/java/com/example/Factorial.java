package com.example;

public class Factorial {
    public long compute(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
