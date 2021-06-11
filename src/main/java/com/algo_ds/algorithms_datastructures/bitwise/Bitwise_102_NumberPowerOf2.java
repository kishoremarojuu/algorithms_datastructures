package com.algo_ds.algorithms_datastructures.bitwise;

class Bitwise_102_NumberPowerOf2 {

    // Function to check if
    // x is power of 2
    static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;

        while (n != 1) {
            System.out.println();
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    // Driver program
    public static void main(String args[]) {
        if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(18))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}

// This code is contributed by Nikita tiwari.


