package com.algo_ds.algorithms_datastructures.bitwise;


// Java program to find maximum consecutive
// 1's in binary representation of a number
// after flipping one bit.

class Bitwise_106_FlipBitToWinApproach1 {

    static int flipBit(int num) {
        int count=0;
        while(num>0){
            num=num&(num<<1);
            count++;
        }

        return count;
    }


    // Driver code
    public static void main(String[] args) {
        // input 1
        System.out.println(flipBit(13));

        // input 2
        System.out.println(flipBit(1775));

        // input 3
        System.out.println(flipBit(15));
    }
}

// This code is contributed by PrinciRaj1992

