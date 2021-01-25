package com.algo_ds.algorithms_datastructures1.arrays_string;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//this will retrun the Most_frequent_element_array
public class Arrays_110_Most_frequent_element_array {
    public static void main(String [] args){
        int[] arr={2,6,2,2,6,8,8,8,8};
        System.out.println("printing the Most_frequent_element_array");
        System.out.println(Most_frequent_element_array(arr));;
    }
    public static int Most_frequent_element_array(int[] arr){
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
        int maxCount = Integer.MIN_VALUE;
        int res= Integer.MIN_VALUE;
        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            int value = (int)mapElement.getValue();
            if(value>maxCount){
                maxCount=value;
                res = (int )mapElement.getKey();
            }
        }
        return res;
    }
}
