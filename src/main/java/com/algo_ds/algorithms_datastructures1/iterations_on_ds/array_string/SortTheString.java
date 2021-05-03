package com.algo_ds.algorithms_datastructures1.iterations_on_ds.array_string;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheString {
    public static void main(String[] args) {

        int[] listOfNumbers = {5, 4, 8, 6, 2, 4, 5, 9, 7};
        Arrays.sort(listOfNumbers);


        String[] names = {"kishore", "divya", "ashoka", "roja", "karthik"};


        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(names));


    }
}
