package com.algo_ds.algorithms_datastructures.iterations_on_ds.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BasicHashMapIteration {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "kishore");
        hashMap.put(2, "divya");
        hashMap.put(3, "roja");
        hashMap.put(4, "ashoka");
        hashMap.put(5, "karthik");

        //iterating hashmap with for loop
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries) {
            // System.out.print(entry.getKey()); System.out.println(entry.getValue());
        }

       //iterating hashmap with while loop
        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            // System.out.print(mapElement.getKey()); System.out.println(mapElement.getValue());
        }

        //using java8 streams
        hashMap.entrySet().stream()
                .forEach(e-> System.out.println(e.getKey() + e.getValue()));


    }
}
