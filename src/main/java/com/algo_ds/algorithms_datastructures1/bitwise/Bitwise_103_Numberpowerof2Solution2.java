
package com.algo_ds.algorithms_datastructures1.bitwise;

// This program is contributed by Gaurav Miglani
class Bitwise_103_Numberpowerof2Solution2 {
    /* Method to check if x is power of 2*/
    static boolean isPowerOfTwo(int x) {
	/* First x in the below expression is
		for the case when x is 0 */
        return x != 0 && ((x & (x - 1)) == 0);

    }

    // Driver method
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
        System.out.println(isPowerOfTwo(6) ? "Yes" : "No");

    }
}
