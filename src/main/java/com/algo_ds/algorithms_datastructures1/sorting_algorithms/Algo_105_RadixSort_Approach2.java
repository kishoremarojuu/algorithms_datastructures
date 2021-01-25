package com.algo_ds.algorithms_datastructures1.sorting_algorithms;


//https://bit.ly/2MJHo7J
import java.util.Arrays;

public class Algo_105_RadixSort_Approach2 {
    public static void sort(int[] array) {
        Algo_105_RadixSort_Approach2.sort(array, 10);
    }

    public static void sort(int[] array, int radix) {
        if (array.length == 0) {
            return;
        }

        // Determine minimum and maximum values
        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        // Perform counting sort on each exponent/digit, starting at the least
        // significant digit
        int exponent = 1;
        while ((maxValue - minValue) / exponent >= 1) {
            Algo_105_RadixSort_Approach2.countingSortByDigit(array, radix, exponent, minValue);
            exponent *= radix;
        }
    }

    private static void countingSortByDigit(int[] array, int radix, int exponent, int minValue) {
        int bucketIndex;
        int[] buckets = new int[radix];
        int[] output = new int[array.length];

        // Initialize bucket
        for (int i = 0; i < radix; i++) {
            buckets[i] = 0;
        }

        // Count frequencies
        for (int i = 0; i < array.length; i++) {
            bucketIndex = (int)(((array[i] - minValue) / exponent) % radix);
            buckets[bucketIndex]++;
        }

        // Compute cumulates
        for (int i = 1; i < radix; i++) {
            buckets[i] += buckets[i - 1];
        }

        // Move records
        for (int i = array.length - 1; i >= 0; i--) {
            bucketIndex = (int)(((array[i] - minValue) / exponent) % radix);
            output[--buckets[bucketIndex]] = array[i];
        }

        // Copy back
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
    // Method to test above
    public static void main(String args[])
    {
        Algo_105_RadixSort_Approach2 ob = new Algo_105_RadixSort_Approach2();
        //int nums[] = {7, -5, 3, 2, 1, 0, 45};
        int nums[] = {960,951,207,328,406,508,227,256,785};
        
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
    }
}
