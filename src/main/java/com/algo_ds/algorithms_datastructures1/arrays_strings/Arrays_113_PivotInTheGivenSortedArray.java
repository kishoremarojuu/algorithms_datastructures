package com.algo_ds.algorithms_datastructures1.arrays_strings;


public class Arrays_113_PivotInTheGivenSortedArray {
    public static void main(String[] args) {
       // int[] array = {2,4,3,1,2,4};
        int[] array = {73,85,94,27,34,47,54,66,21};
        System.out.println(pivotElementIntheArray(array));
    }

    private static int  pivotElementIntheArray(int[] array) {


        int min= Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return index;

    }

}


