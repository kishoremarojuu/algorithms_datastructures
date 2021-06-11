package com.algo_ds.algorithms_datastructures.bitwise;


// Java program to find maximum consecutive
// 1's in binary representation of a number
// after flipping one bit.

class Bitwise_106_FlipBitToWin {

    static int flipBit(int a) {
		/* If all bits are l, binary representation
		of 'a' has all 1s */
        if (~a == 0) {
            return 8 * sizeof();
        }

        int currLen = 0, prevLen = 0, maxLen = 0;
        while (a != 0) {
            // If Current bit is a 1
            // then increment currLen++
            if ((a & 1) == 1) {
                currLen++;
            }

            // If Current bit is a 0 then
            // check next bit of a
            else if ((a & 1) == 0) {
				/* Update prevLen to 0 (if next bit is 0)
				or currLen (if next bit is 1). */
                prevLen = (a & 2) == 0 ? 0 : currLen;

                // If two consecutively bits are 0
                // then currLen also will be 0.
                currLen = 0;
            }

            // Update maxLen if required
            maxLen = Math.max(prevLen + currLen, maxLen);

            // Remove last bit (Right shift)
            a >>= 1;
        }

        // We can always have a sequence of
        // at least one 1, this is fliped bit
        return maxLen + 1;
    }

    static byte sizeof() {
        byte sizeOfInteger = 8;
        return sizeOfInteger;
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

