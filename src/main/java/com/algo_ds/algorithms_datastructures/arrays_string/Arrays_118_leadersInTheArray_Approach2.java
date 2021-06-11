package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_118_leadersInTheArray_Approach2 {

    // main function
    public static void main(String args[]) {
        int[] arr = {98, 23, 54, 12, 20, 7, 27};
        int n = arr.length;
        leaderInTheArray(arr, n);
    }

    private static void leaderInTheArray(int[] arr, int n) {
        int currrentIndex = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > currrentIndex) {
                currrentIndex = arr[i];
                System.out.println("leaders in the array:" + currrentIndex);
            }
        }
    }
}