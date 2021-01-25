package com.algo_ds.algorithms_datastructures1.arrays_string;

public class Arrays_109_peakElementInTheList {

    public static void main(String[] args) {

        int[] A = {8, 9, 10, 2, 5, 6};
        System.out.println(findPeakElement(A));
    }

    private static int findPeakElement(int[] array) {

        int peakElement = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i + 1] < array[i]) {
                peakElement = array[i];
                break;
            }
        }
        return peakElement;
    }
}

//runTime : O(n)
//this is regular approach, but we can achieve the better runTime O(logn) in next