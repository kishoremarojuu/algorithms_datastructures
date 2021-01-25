package com.algo_ds.algorithms_datastructures1.dynamic_programming;// Java program for Painting Fence Algorithm

class DP_115_PaintFence {

    // Returns count of ways to color k posts
// using k colors 
    public static int countWays(int n, int k) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = k;
        dp[2] = k * k;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) * (k - 1);
        }
        return dp[n];


    }

    // Driver code
    public static void main(String[] args) {
        int n = 3, k = 2;
        System.out.println(countWays(n, k));
    }
}

// This code contributed by Rajput-Ji 
