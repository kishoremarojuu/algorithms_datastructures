package com.algo_ds.algorithms_datastructures1.bitwise;


// Java program to Binary real number to String.

// Class Reperesentation of Binary real number
// to String
class Bitwise_101_BinaryToString {
    // Main function to convert Binary real number
    // to String
    static String printBinary(double num) {
        // Check Number is Between 0 to 1 or Not
        if (num >= 1 || num <= 0)
            return "ERROR";

        StringBuilder binary = new StringBuilder();
        System.out.println("binary:"+binary.toString());
        binary.append(".");

        while (num > 0) {
			/* Setting a limit on length: 32 characters,
			If the number cannot be represented
			accurately in binary with at most 32
			character */
            if (binary.length() >= 32)
                return "ERROR";

            // Multiply by 2 in num to check it 1 or 0
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;



            }

        }
        return binary.toString();
    }

    // Driver Code
    public static void main(String[] args) {
        double num1 = 0.625; // Input value in Decimal
        String output = printBinary(num1);
        System.out.println("(0" + output + ") in base 2");

        double num2 = 0.72;
        output = printBinary(num2);
        System.out.println("(" + output + ") ");
    }
}
