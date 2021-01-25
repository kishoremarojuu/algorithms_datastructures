package com.algo_ds.algorithms_datastructures1.arrays_string;

public class Arrays_119_Count_frequencies_array_elements_Approach2 {
    // main function
    public static void main(String args[]) {
        int[] input = {2, 3, 3, 2, 5};
        frequencyOfArrayElements(input);
    }

    private static void frequencyOfArrayElements(int[] input) {

        int n = input.length;
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[input[i] - 1]++;
        }

        for(int i=0;i<n;i++){
            System.out.println(i+1 + " "+count[i]);
        }
    }


}
