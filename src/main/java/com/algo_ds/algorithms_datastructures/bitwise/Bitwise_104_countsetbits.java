package com.algo_ds.algorithms_datastructures.bitwise;

    // Java program to Count set
// bits in an integer

class Bitwise_104_countsetbits {
    /* Function to get no of set
    bits in binary representation
    of positive integer n */
    static int countSetBits(int n)
    {
        int count = 0;
        /*while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;*/

        while(n>0)
        {
            n = n&(n-1);
            count++;
        }
        return count;
    }

    // driver program
    public static void main(String args[])
    {
        int i = 15;
        System.out.println(countSetBits(i));
    }
}

// This code is contributed by Anshika Goyal.

