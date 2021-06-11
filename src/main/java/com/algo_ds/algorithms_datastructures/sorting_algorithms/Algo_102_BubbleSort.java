package com.algo_ds.algorithms_datastructures.sorting_algorithms;

// Java program for implementation of Bubble Sort
class Algo_102_BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(" " + i);
        }


    }
    //runTime complexity: o(n*2)
} 
