package com.algo_ds.algorithms_datastructures.dynamic_programming;

    /* We have input values of N and an array Coins
that holds all of the coins. We use data type
of long because we want to be able to test
large values
without integer overflow*/

class DP_107_CoinChangeProblem {

    static int getNumberOfWays(int S[], int m, int n) {
        // Create the ways array to 1 plus the amount
        // to stop overflow
       // long[] table = new long[n+1];
        int[][] table = new int[m + 1][n + 1];

        // Set the first way to 1 because its 0 and
        // there is 1 way to make 0 with 0 coins
        //table[0][0] = 1;

        // Base case (If given value is 0)
        for (int i = 0; i < m; i++) {
            table[0][i] = 1;
        }

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {
                if (S[i - 1] > j) {
                    table[i][j] = table[i - 1][j];

                } else {
                    table[i][j] = table[i - 1][j] + table[i][j - (i - 1)];
                }

            }
        }
        return table[m][n];
    }

    static void printArray(int[] coins) {
        for (int i : coins)
            System.out.println(i);
    }

   /* public static void main(String args[]) {
        int Coins[] = {1, 5, 10};

        System.out.println("The Coins Array:");
        printArray(Coins);

        int m = Coins.length;
        System.out.println("Solution:");
        System.out.println(getNumberOfWays(Coins,m, 12));
    }*/

    // Driver Function to test above function
    public static void main(String args[])
    {
        int Coins[] = {1, 2, 3};
        int m = Coins.length;
        int n = 4;
        System.out.println(getNumberOfWays(Coins, m, n));
    }
}

