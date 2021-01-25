package com.algo_ds.algorithms_datastructures1.arrays_strings;

import java.util.Arrays;

public class Arrays_104_RotationofElementsInTheArraybyKTimes {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6,7 };
        int k = 3;
        reverseTheArrayMethod(arr, 0, arr.length - 1);
        reverseTheArrayMethod(arr, 0, k - 1);
        reverseTheArrayMethod(arr, k, arr.length - 1);
    }

    private static void reverseTheArrayMethod(int[] arr, int start, int end) {

        int temp = 0;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

