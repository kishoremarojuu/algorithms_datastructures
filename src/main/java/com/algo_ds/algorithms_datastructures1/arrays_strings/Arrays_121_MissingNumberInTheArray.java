package com.algo_ds.algorithms_datastructures1.arrays_strings;

public class Arrays_121_MissingNumberInTheArray {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        missingNumberinTheArray(arr);
    }

    private static void missingNumberinTheArray(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;


        }
        System.out.println(sum);

        int n = arr.length+1;

        int finalOuput = (n*(n-1)/2)-sum;

        System.out.println(finalOuput);
    }

}
