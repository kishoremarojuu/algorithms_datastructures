package com.algo_ds.algorithms_datastructures1.arrays_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Arrays_119_Count_frequencies_array_elements {
    // main function
    public static void main(String args[]) {
        int[] arr = {2, 3, 3, 2, 5,8,8,999,9,9,9};
        int n = arr.length;
        frequencyOfArrayElements(arr, n);
    }

    private static void frequencyOfArrayElements(int[] arr, int n) {

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            if (hmap.containsKey(arr[i])) {
                int c = hmap.get(arr[i]);
                int d=c+1;
                hmap.put(arr[i], d);
            }else {
                hmap.put(arr[i], counter);
                counter=1;
            }
        }


        System.out.println("iterating hashmap with for loop");
        Set<Map.Entry<Integer, Integer>> entries = hmap.entrySet();
        for (Map.Entry<Integer, Integer> entry: entries) {
            System.out.println("key is :"+entry.getKey() +"and the frequency is:"+entry.getValue());
        }

    }


}
