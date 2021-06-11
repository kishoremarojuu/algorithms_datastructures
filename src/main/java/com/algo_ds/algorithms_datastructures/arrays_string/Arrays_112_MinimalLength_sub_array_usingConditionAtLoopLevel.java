package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_112_MinimalLength_sub_array_usingConditionAtLoopLevel {

    public static void main(String[] args) {
        //int[] array = {2,3,1,2,4,3};
        int[] array = {2,4,3,1,2,4};
        int k = 7;
        printMinSubArrayWithSum(array, k);
    }

    public static void printMinSubArrayWithSum(int[] array, int k) {

        int start = -1;     // Start of min subarray
        int end = -1;       // End of min subarray
        int min = Integer.MAX_VALUE;    // size of the smallest subarray with sum = k


        for(int i = 0; i < array.length; i++) {

            int currentSum = 0;
            for(int j = i; j < array.length && (j-i+1) < min; j++) {
                currentSum += array[j];
                if(end-start+1<min){
                    if(currentSum == k) {
                        start = i;
                        end = j;
                        min = end - start + 1;
                        break;
                    }
                }

            }
        }

        if(start == -1 || end == -1)  {
            System.out.println("No subarray exists with sum = " + k);
            return ;
        }


        System.out.print("[ ");
        while(start <= end) {
            System.out.print(array[start] + " ");
            start++;;
        }
        System.out.println("]");
    }

}
