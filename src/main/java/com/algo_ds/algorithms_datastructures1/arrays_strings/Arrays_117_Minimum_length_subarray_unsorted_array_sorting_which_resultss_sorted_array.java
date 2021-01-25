package com.algo_ds.algorithms_datastructures1.arrays_strings;

public class Arrays_117_Minimum_length_subarray_unsorted_array_sorting_which_resultss_sorted_array {

    static void printUnsorted(int arr[], int n) {
        int s = 0, e = n - 1, i, max, min;

        // step 1(a) of above algo
        for (s = 0; s < n - 1; s++) {
            if (arr[s] > arr[s + 1])
                break;
        }
        if (s == n - 1) {
            System.out.println("The complete array is sorted");
            return;
        }

        // step 1(b) of above algo
        for (e = n - 1; e > 0; e--) {
            if (arr[e] < arr[e - 1])
                break;
        }

        // step 2(a) of above algo
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for (i = s; i <= e; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        // step 2(b) of above algo
        for (i = 0; i < s; i++) {
            if (arr[i] > min) {
                s = i;
                break;
            }
        }

        // step 2(c) of above algo
        for (i = n - 1; i >= e + 1; i--) {
            if (arr[i] < max) {
                e = i;
                break;
            }
        }

        // step 3 of above algo
        System.out.println(" The unsorted subarray which" +
                " makes the given array sorted lies" +
                " between the indices " + s + " and " + e);
        return;
    }

    public static void main(String args[]) {
        //int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int arr[] = {1,4,7,5,10,18,17,26,30,45,50,62};
        int arr_size = arr.length;
        printUnsorted(arr, arr_size);
    }
}
