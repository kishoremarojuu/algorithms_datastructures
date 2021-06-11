package com.algo_ds.algorithms_datastructures;

import org.junit.jupiter.api.Test;


class AlgorithmsDatastructures1ApplicationTests {

    @Test
    public void test() {
        int arr[] = {8, 5, 7, 6, 10};
        int k = 6;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //Arrays.sort(arr);
        System.out.println("sorted array");
        for (int j : arr) {
            System.out.print(" " + j);
        }

        int n = arr.length - 1;

        System.out.println("--------------------------");
        int result = binarySearch(arr, 0, n, k);
        if (result ==-1) {
            System.out.println("elements is not found in the array");
        } else {
            System.out.println("elemet is found at index:" + result);
        }


    }

    public int binarySearch(int[] arr, int start, int last, int k) {

        if (last >= start) {
            int mid = (start + last) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (k < arr[mid]) {
                return binarySearch(arr, start, mid - 1, k);
            } else if (k > arr[mid]) {
                return binarySearch(arr, mid + 1, last, k);
            }


        }
        return -1;
    }


}
