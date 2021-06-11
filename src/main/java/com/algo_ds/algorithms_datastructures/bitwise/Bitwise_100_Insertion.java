package com.algo_ds.algorithms_datastructures.bitwise;

    // Java program for implementation of updateBits()

    class Bitwise_100_Insertion
    {
        // Function to updateBits M insert to N.
        static int updateBits(int n, int m, int i, int j)
        {
		/* Create a mask to clear bits i through j
		in n. EXAMPLE: i = 2, j = 4. Result
		should be 11100011. For simplicity, we'll
		use just 8 bits for the example. */

            int allOnes = ~0; // will equal sequence of all ls

            // ls before position j, then 0s. left = 11100000
            int left= allOnes << (j + 1);

            // l's after position i. right = 00000011
            int right = ((1 << i) - 1);

            // All ls, except for 0s between i and j. mask 11100011
            int mask = left | right;

            /* Clear bits j through i then put min there */
            // Clear bits j through i.
            int n_cleared = n & mask;
            // Move m into correct position.
            int m_shifted = m << i;

            // OR them, and we're done!
            return (n_cleared | m_shifted);
        }

        public static void main (String[] args)
        {
            // in Binary N= 10000000000
            int n = 1024;

            // in Binary M= 10011
            int m = 19;

            int i = 2, j = 6;

            System.out.println(updateBits(n,m,i,j));
        }
    }

