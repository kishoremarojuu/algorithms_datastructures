package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_109_peakElementInTheListApproach2 {

    public static Integer getPeakElement(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        int n = array.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {
                return array[mid]; // array[mid] is peak element
            } else if (mid > 0 && array[mid - 1] > array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //int[] array = { 15, 20, 25, 35, 45, 50, 60 };
        int[] array = { 1,4,6,7,5};


        Integer peak = getPeakElement(array);
        System.out.println(peak != null ? "Peak Element is " + peak : "No peak element!");
    }
}
