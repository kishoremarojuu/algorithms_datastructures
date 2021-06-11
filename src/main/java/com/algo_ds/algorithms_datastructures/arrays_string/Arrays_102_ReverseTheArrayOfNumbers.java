package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_102_ReverseTheArrayOfNumbers {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,8,9,10,12,14,16};
        int lenght = arr.length-1;
        reverseTheArrayMethod(arr, 0, lenght);
    }

    public static void reverseTheArrayMethod(int[] arr, int start, int end){
        int n = arr.length;
        int[] tempArray = new int[arr.length-1];
        for(int i=0;i<n-1;i++){
            tempArray[i]= arr[n-1-i];
        }

        for(int i=0;i<tempArray.length;i++){
            System.out.println(tempArray[i]);
        }

    }


}

//this is okay but we can still optimize this, that solution you will see in second appraoch2