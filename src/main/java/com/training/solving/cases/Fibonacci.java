package com.training.solving.cases;

public class Fibonacci {
    int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fib(n - 2) + fib(n - 1);
    }
}
