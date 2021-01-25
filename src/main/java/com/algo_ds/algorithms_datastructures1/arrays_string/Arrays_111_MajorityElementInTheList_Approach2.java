package com.algo_ds.algorithms_datastructures1.arrays_string;

//https://www.youtube.com/watch?v=zOyOwDEF1Rc&list=PLamzFoFxwoNjw4EpaVZzP-8lqWA9hOmnD&index=3&t=0s
//Given an array of size n, find the element which occurs more than n/2 times. This element is called Majority Element.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Arrays_111_MajorityElementInTheList_Approach2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1,1};
        Arrays.sort(arr);
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr){
        int majorityCount = arr.length / 2;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(hmap.containsKey(key)){
                int freq=hmap.get(key);
                freq= freq+1;
                hmap.put(key, freq);
            }else{
                hmap.put(key, 1);
            }
        }
        Iterator iterator = hmap.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
          //  System.out.println(mapElement.getKey());
            int value = (int)mapElement.getValue();
            int key= (int )mapElement.getKey();
            if(value>majorityCount){
               return key;
            }
        }
        return -1;
    }


}


